package com.mrasband.exampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author matt
 */
@SpringBootApplication
@Configuration
@EnableOAuth2Sso
public class ExampleApp extends WebSecurityConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApp.class, args);
    }
}
