package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

    public String sayHello() {
        return "Hello World";
    }

    public String sayGoodbye() {
        return "Goodbye World";
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}