package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private BeanB beanB;

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
