package com.example.demo.components;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleComponentTest {
    
    // write a unit test for SampleComponent
    // test the sayHello() method
    public void testSayHello() {
        SampleComponent sampleComponent = new SampleComponent();
        String result = sampleComponent.sayHello();
        assertEquals("Hello World", result);
    }
    // test the sayGoodbye() method
}
