package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}
