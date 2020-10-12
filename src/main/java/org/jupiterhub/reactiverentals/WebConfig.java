package org.jupiterhub.reactiverentals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.ViewResolverRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {
    @Bean
    public RouterFunction<?> routerFunctionA() {
        // TODO
        return null;
    }

    @Bean
    public RouterFunction<?> routerFunctionB() {
        // TODO
        return null;
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
