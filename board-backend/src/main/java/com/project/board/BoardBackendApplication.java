package com.project.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BoardBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardBackendApplication.class, args);
    }

}
