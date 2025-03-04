package com.mysite.sbb_api;

import com.mysite.sbb_api.config.CustomAuthenticationSuccessHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbbApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbbApiApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ApplicationContext context) {
        return args -> {
            System.out.println("CustomAuthenticationSuccessHandler: " +
                    context.getBean(CustomAuthenticationSuccessHandler.class));
        };
    }
}
