package org.jupiterhub.reactiverentals.routerfunction;

import org.jupiterhub.reactiverentals.handler.PersonHandler;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

public class PersonRouter {

    private PersonHandler handler;

    RouterFunction<ServerResponse> route = RouterFunctions.route()
            .GET("/person/{id}", accept(APPLICATION_JSON), handler::getPerson)
            .GET("/person", accept(APPLICATION_JSON), handler::listPeople)
            .POST("/person", handler::createPerson)
            .build();

}
