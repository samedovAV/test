package com.example.test;

import org.springframework.stereotype.Component;


@Component
public class BeanA {

    private final BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public String returnString(String name) {
        beanB.setName(name);
        return "Hello " + beanB.getName();
    }
}
