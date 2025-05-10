package com.github.dataprocessutils.dataprocessapi;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DataProcessApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataProcessApiApplication.class, args);
    }

}
