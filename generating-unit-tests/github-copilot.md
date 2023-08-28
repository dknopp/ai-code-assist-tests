
Github Co-Pilot
======================

This readme documents an experiment using github co-pilot to generate unit tests.

The following component was largely generated using copilot suggestions.

```java
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
```

I was then able to create unit tests by first adding the unit test file SampleComponentTest.java and
then using the code suggestions along with comment hints to the assistant.

```java
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
```

So with copilot as with tabnine I'm unable to get the tool to generate an entire unit test class from scratch.
But I can quickly write unit tests by using the suggestions.