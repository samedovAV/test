package com.example.test;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanA {

    private BeanB beanB;

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @PostConstruct
    public void init() {
        this.beanB.doSomething(beanB);
    }
}
