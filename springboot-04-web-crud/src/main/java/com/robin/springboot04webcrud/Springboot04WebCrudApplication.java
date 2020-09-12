package com.robin.springboot04webcrud;

import com.robin.springboot04webcrud.component.MyLocaleResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class Springboot04WebCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04WebCrudApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
