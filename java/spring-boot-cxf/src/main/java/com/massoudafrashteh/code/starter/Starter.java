package com.massoudafrashteh.code.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com")
@EntityScan(basePackages = "com.massoudafrashteh.code.domain")
@EnableJpaRepositories(basePackages = "com.massoudafrashteh.code.repository")
public class Starter {

    public static void main(final String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}