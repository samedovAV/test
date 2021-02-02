package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeanController {

    BeanService beanService;

    @GetMapping(value = "/get")
    public List<BeanB> getAllBeans() {
        return beanService.getAllBeans();
    }
}
