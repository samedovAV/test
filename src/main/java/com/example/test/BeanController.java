package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BeanController {

    private final BeanService beanService;

    @GetMapping(value = "/get")
    public List<BeanB> getAllBeans() {
        return beanService.getAllBeans();
    }
}
