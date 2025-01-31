package com.github.cassiusbessa.vision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.Map;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class })
public class Main {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Main.class);
        app.setDefaultProperties(
                Map.of(
                        "server.port", "7777"
                )
        );
        app.run(args);
    }
}
