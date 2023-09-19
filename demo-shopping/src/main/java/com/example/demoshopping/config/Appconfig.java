package com.example.demoshopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Appconfig {

  @Bean // Annotation on method ONLY
  RestTemplate restTemplate() { // public , private nothing
    return new RestTemplate();
  }
}
