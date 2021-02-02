package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    private final BeanA beanA;

    public BeanController(BeanA beanA) {
        this.beanA = beanA;
    }

    // Реализация через путь
    @GetMapping(value = "/get/{name}")
    public String call(@PathVariable String name) {
        return beanA.returnString(name);
    }

    // Реализация через параметр (знак вопроса)
    @GetMapping(value = "/get-name")
    public String callWithParameter(@RequestParam String name) {
        return beanA.returnString(name);
    }

}
