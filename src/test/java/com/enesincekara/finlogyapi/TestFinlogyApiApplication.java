package com.enesincekara.finlogyapi;

import org.springframework.boot.SpringApplication;

public class TestFinlogyApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(FinlogyApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
