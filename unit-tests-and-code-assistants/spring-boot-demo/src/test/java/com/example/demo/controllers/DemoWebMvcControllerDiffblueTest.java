package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DemoWebMvcController.class})
@ExtendWith(SpringExtension.class)
class DemoWebMvcControllerDiffblueTest {
  @Autowired
  private DemoWebMvcController demoWebMvcController;
  /**
  * Method under test: {@link DemoWebMvcController#index()}
  */
  @Test
  void testIndex() {
    // Arrange, Act and Assert
    assertEquals("index", demoWebMvcController.index());
  }
}

