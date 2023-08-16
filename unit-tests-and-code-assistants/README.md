Tests of various LLM tools for generating unit tests and for use as coding assistants
================================================================

Contents:
 * spring-boot-demo: a spring boot starter to use as an experimental test bed for seeing how LLMs generate unit tests or provide other code suggestions.


A conversation with ChatGPT
----------------------------------------------------------------

*Prompt*


> Write a unit test for this spring boot controller
```java
package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
```

*Response*

Sure, here's an example of a unit test using JUnit and Spring Boot's testing framework for your `DemoRestController` class:

```java
package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoRestControllerTest {

    @Test
    public void testHelloEndpoint() {
        // Arrange
        DemoRestController controller = new DemoRestController();

        // Act
        ResponseEntity<String> response = controller.hello();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello World!", response.getBody());
    }
}
```

In this test, the `testHelloEndpoint` method does the following:

1. Creates an instance of `DemoRestController`.
2. Calls the `hello` method on the controller to get the response.
3. Uses assertions to check if the HTTP status code is OK (200) and if the response body matches the expected "Hello World!" string.

Make sure you have JUnit and Spring Boot's testing libraries in your project's dependencies to run this test successfully.


*Prompt*

Write a client for the following springboot controller
```java
package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
```

*Response*

Certainly! Here's an example of a Java client that uses the `RestTemplate` class to make a GET request to the `hello` endpoint of your `DemoRestController`:

```java
package com.example.demo.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DemoRestClient {

    public static void main(String[] args) {
        // Create a RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // Define the API endpoint URL
        String apiUrl = "http://localhost:8080/hello"; // Change this URL as per your application

        // Make a GET request and receive the response
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        // Print the response body
        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Response Body: " + response.getBody());
        } else {
            System.out.println("Request failed with status code: " + response.getStatusCode());
        }
    }
}
```

Please note that you'll need to have the Spring Web dependency in your project to use the `RestTemplate` class. You should also replace the `apiUrl` value with the appropriate URL of your Spring Boot application, where it's running and exposing the `hello` endpoint.

Make sure your Spring Boot application is up and running before running this client, as it needs to connect to the API you've defined.

*Prompt*

Write a client in python for the following springboot controller
package com.example.demo.controllers;

```
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
```

*Response*

Certainly! Here's an example of a Python client using the `requests` library to make a GET request to the `hello` endpoint of your `DemoRestController`:

```python
import requests

def main():
    # Define the API endpoint URL
    api_url = "http://localhost:8080/hello"  # Change this URL as per your application

    # Make a GET request
    response = requests.get(api_url)

    # Print the response content
    if response.status_code == 200:
        print("Response Body:", response.text)
    else:
        print("Request failed with status code:", response.status_code)

if __name__ == "__main__":
    main()
```

Make sure you have the `requests` library installed in your Python environment. You can install it using the following command:

```
pip install requests
```

Just like with the Java client, replace the `api_url` value with the appropriate URL of your Spring Boot application where it's running and exposing the `hello` endpoint.

Ensure your Spring Boot application is running before you run this client so that it can connect to the API endpoint.