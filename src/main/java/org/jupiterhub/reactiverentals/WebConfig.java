package org.jupiterhub.reactiverentals;

import org.jupiterhub.reactiverentals.router.PersonRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.ViewResolverRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    @Autowired
    private PersonRouter personRouter;

    @Bean
    public RouterFunction<ServerResponse> getPersons() {
        return personRouter.getPersonRoutes();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }

    @Override
    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

    }
}