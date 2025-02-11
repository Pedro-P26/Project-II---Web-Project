package org.example.projeto2web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@RestController
@SpringBootApplication
public class Projeto2webApplication {

    public static void main(String[] args) {
        SpringApplication.run(Projeto2webApplication.class, args);
    }


    /*@Bean
    public WebMvcConfigurer defaultViewConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("forward:/login.html");
                registry.addViewController("/rececionista_dash").setViewName("forward:/rececionista_dash.html");
            }
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/static/");
                registry.addResourceHandler("/imagens/**")
                        .addResourceLocations("/imagens/");
            }
        };
    }
*/
}
