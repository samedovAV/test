package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    public String printGreeting(String value) {
        return "Hello, dear " + value;
    }

}
