package com.example.test;

import org.springframework.web.bind.annotation.*;

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

    // Отправить параметр через POST
    // curl -X POST http://localhost:8080/send-name/vasya
    @PostMapping(value = "/send-name/{name}")
    public String sendAndCall(@PathVariable String name) {
        return beanA.returnString(name);
    }
}
