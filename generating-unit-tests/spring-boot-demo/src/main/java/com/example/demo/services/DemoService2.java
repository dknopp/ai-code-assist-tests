package com.example.demo.services;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.example.demo.components.SampleComponent;

@Service
public class DemoService2 {
    
    private SampleComponent sampleComponent;

    public DemoService2(SampleComponent sampleComponent) {
        this.sampleComponent = sampleComponent;
    }

    public String sayHello(String name) {
        return sampleComponent.sayHello(name);
    }

    public int doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(int input) {
        if(input == 1) {
            if(Math.random() * 100 > 50) {
                return 1;
            } else {
                return 0;
            }
        } else if(input % 3 == 1) {
            return doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(1);
        }
        if(input % 3 == 2) {
            try {
                return ((HttpURLConnection) new URL("https://www.google.com").openConnection()).getResponseCode();
            } catch(Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        return 0;
    }
}
