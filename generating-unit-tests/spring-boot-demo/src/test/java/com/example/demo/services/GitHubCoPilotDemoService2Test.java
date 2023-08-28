package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import com.example.demo.components.SampleComponent;

public class GitHubCoPilotDemoService2Test {
    
    private DemoService2 demoService2;

    @BeforeAll
    public void init() {
        demoService2 = new DemoService2(new SampleComponent());
    }

    // write a unit test for DemoService2
    // test the sayHello() method
    public void testSayHello() {
        String result = demoService2.sayHello("World");
        assertEquals("Hello World", result);
    }

    // test the doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt() method
    public void testDoSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt() {
        int result = demoService2.doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(1);
        assertEquals(0, result);
    }

    // test all return cases of the doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt() method
    public void testDoSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt2() {
        int result = demoService2.doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(2);
        assertEquals(200, result);
    }
}
