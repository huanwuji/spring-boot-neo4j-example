package com.huanwuji.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.huanwuji")
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        Neo4jPersister neo4jPersister = context.getBean(Neo4jPersister.class);
        neo4jPersister.createTestData();
    }
}