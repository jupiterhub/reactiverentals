package org.jupiterhub.reactiverentals.router;

import org.jupiterhub.reactiverentals.handler.PersonHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class PersonRouter {

    @Autowired
    private PersonHandler handler;

    private SecurityExpressionRoot securityManager;

    public RouterFunction<ServerResponse> getPersonRoutes() {
        return RouterFunctions.route()
                .GET("/person/{id}", accept(APPLICATION_JSON), handler::getPerson)
                .GET("/person", accept(APPLICATION_JSON), handler::listPeople)
                .POST("/person", handler::createPerson)
                .build();
    }

    public RouterFunction<ServerResponse> getPersonRoutesNested() {
        return RouterFunctions.route()
                .path("/person", b1 -> b1
                        .nest(accept(APPLICATION_JSON), b2 -> b2
                                .GET("/{id}", handler::getPerson)
                                .GET("", handler::listPeople))
                        .POST("/person", handler::createPerson))
                .build();
    }

    public RouterFunction<ServerResponse> getPersonRoutesWitSecurity() {
        return RouterFunctions.route()
                .path("/person", b1 -> b1
                        .nest(accept(APPLICATION_JSON), b2 -> b2
                                .GET("/{id}", handler::getPerson)
                                .GET("", handler::listPeople))
                        .POST("/person", handler::createPerson))
                .filter((request, next) -> {
                    // sample filter on
                    if (securityManager.hasRole(request.headers().firstHeader(HttpHeaders.AUTHORIZATION))) {
                        return next.handle(request);
                    }
                    else {
                        return ServerResponse.status(HttpStatus.UNAUTHORIZED).build();
                    }
                })
                .build();
    }

}
