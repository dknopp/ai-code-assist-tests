Python DIY Assistant
=========================================

A simple python script for generating unit tests using ChatGPT

Example usage:
```powershell

(venv) PS C:\Users\djkno\projects\openai-tests\unit-tests-and-code-assistants> python pydiy_assistant --api-key=<TOKEN> .\spring-boot-demo\src\main\java\com\example\demo\controllers\DemoRestController.java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.controllers.DemoRestController;

class DemoRestControllerTest {

    @Test
    void testHello() {
        DemoRestController demoRestController = new DemoRestController();
        String expected = "Hello World!";
        String actual = demoRestController.hello().getBody();
        assertEquals(expected, actual, "The controller does not return the expected string");
    }

}

```