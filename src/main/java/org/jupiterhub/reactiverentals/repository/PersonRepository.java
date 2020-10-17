package org.jupiterhub.reactiverentals.repository;

import org.jupiterhub.reactiverentals.record.Person;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class PersonRepository {
    public Flux<Person> allPeople() {
        return Flux.empty();
    }

    public Publisher<Void> savePerson(Mono<Person> person) {
        return Mono.empty();
    }


    public Mono<Object> getPerson(int personId) {
        return Mono.empty();
    }
}
