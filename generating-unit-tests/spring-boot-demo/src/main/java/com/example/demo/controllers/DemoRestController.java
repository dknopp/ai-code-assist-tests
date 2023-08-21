package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
