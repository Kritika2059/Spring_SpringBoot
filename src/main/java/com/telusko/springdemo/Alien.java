package com.telusko.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    laptop laptop;

    public void code() {
        laptop.compile();
        System.out.println("coding");
    }
}
