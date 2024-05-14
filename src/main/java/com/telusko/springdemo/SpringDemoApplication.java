package com.telusko.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

        Alien obj = context.getBean(Alien.class);
        obj.code();

//        Alien obj1 = context.getBean(Alien.class);
//        obj1.code();

//        laptop lap = context.getBean(laptop.class);
//        lap.compile();
    }
}
