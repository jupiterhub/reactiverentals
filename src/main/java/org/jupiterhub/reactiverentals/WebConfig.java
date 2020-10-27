package org.jupiterhub.reactiverentals;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

//    @Autowired
//    private PersonRouter personRouter;
//
//    @Bean
//    public RouterFunction<ServerResponse> getPersons() {
//        return personRouter.getPersonRoutes();
//    }

//    @Bean
//    CorsWebFilter corsFilter() {
//
//        CorsConfiguration config = new CorsConfiguration();
//
//        config.applyPermitDefaultValues();
//
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("https://domain1.com");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsWebFilter(source);
//    }


//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
        // For MVC support this is a more traditional way, see #corsFilter for functional endpoint appriach
//        registry.addMapping("/person/**")
//                .allowedOrigins("https://rental-api.com")
//                .allowedMethods("POST", "DELETE")
//                .allowedHeaders("header1", "header2", "header3")
//                .exposedHeaders("header1", "header2")
//                .allowCredentials(true).maxAge(3600);
//    }
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
//        registrar.setUseIsoFormat(true);
//        registrar.registerFormatters(registry);
//    }
//
//    @Override
//    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
//        // default is 256kb
//        configurer.defaultCodecs().maxInMemorySize(512 * 1024);
//    }
//
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        // use react as script
//        registry.scriptTemplate();
//    }
//
//    @Bean
//    public ScriptTemplateConfigurer configurer() {
//        ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
//        configurer.setEngineName("nashorn");
//        configurer.setScripts("polyfill.js", "react.js", "render.js");
//        configurer.setRenderFunction("render");
//        configurer.setSharedEngine(false);
//        return configurer;
//    }
}
