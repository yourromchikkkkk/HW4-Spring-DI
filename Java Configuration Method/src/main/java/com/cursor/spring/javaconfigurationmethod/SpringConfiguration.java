package com.cursor.spring.javaconfigurationmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cursor.spring.javaconfigurationmethod")
public class SpringConfiguration {

    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator(plusService(), minusService());
    }
}
