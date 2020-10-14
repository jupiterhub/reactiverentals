package org.jupiterhub.reactiverentals.router;

import org.jupiterhub.reactiverentals.handler.PersonHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class PersonRouter {

    private PersonHandler handler;

    public RouterFunction<ServerResponse> getPersonRoutes() {
        return RouterFunctions.route()
                .GET("/person/{id}", accept(APPLICATION_JSON), handler::getPerson)
                .GET("/person", accept(APPLICATION_JSON), handler::listPeople)
                .POST("/person", handler::createPerson)
                .build();
    }

}
