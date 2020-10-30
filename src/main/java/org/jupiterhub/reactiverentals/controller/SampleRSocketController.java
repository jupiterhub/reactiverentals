package org.jupiterhub.reactiverentals.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.rsocket.annotation.ConnectMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class SampleRSocketController {

    // for websocket this is format '.' not '/' like URL's
    @MessageMapping("some.work.like.backup")
    public Mono<Void> fireAndForgetExample() {
        /*
        By default the method would dunamically be updated. based on req/res
        Input Cardinality	Output Cardinality	Interaction Types
        0, 1                0                   Fire-and-Forget, Request-Response
        0, 1                1                   Request-Response
        0, 1                Many                Request-Stream
        Many                0, 1, Many          Request-Channel
        */
        return Mono.empty();
    }

    @ConnectMapping
    public Mono<Void> setupFrame() {
        // called for every service
        return Mono.empty();
    }
}