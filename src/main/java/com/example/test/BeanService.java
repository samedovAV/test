package com.example.test;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeanService {

    private final BeanRepository beanRepository;

    public List<BeanB> getAllBeans() {
        List<BeanB> res = beanRepository.findAll();
        res.forEach(i -> i.doSomething(i));
        return res;
    }

}
