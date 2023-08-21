package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DemoRestController.class})
@ExtendWith(SpringExtension.class)
class DemoRestControllerDiffblueTest {
  @Autowired
  private DemoRestController demoRestController;
  /**
  * Method under test: {@link DemoRestController#hello()}
  */
  @Test
  void testHello() {
    // Arrange and Act
    ResponseEntity<String> actualHelloResult = demoRestController.hello();

    // Assert
    assertEquals("Hello World!", actualHelloResult.getBody());
    assertEquals(200, actualHelloResult.getStatusCodeValue());
    assertTrue(actualHelloResult.getHeaders().isEmpty());
  }
}

