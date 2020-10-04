package org.jupiterhub.reactiverentals.repository;

import org.jupiterhub.reactiverentals.record.Person;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.BiFunction;

public class PersonRepository {
    public Flux<Person> allPeople() {
        return null;
    }

    public BiFunction<ServerWebExchange, ServerResponse.Context, Mono<Void>> savePerson(Mono<Person> person) {
        return null;
    }


    public Mono<Object> getPerson(int personId) {
        return null;
    }
}
