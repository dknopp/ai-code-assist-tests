package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DemoService.class})
@ExtendWith(SpringExtension.class)
class DemoServiceDiffblueTest {
  @Autowired
  private DemoService demoService;
  /**
   * Method under test: {@link DemoService#sayHello(String)}
   */
  @Test
  void testSayHello() {
    // Arrange, Act and Assert
    assertEquals("Hello Name", demoService.sayHello("Name"));
  }

  /**
  * Method under test: {@link DemoService#sayGoodbye(String)}
  */
  @Test
  void testSayGoodbye() {
    // Arrange, Act and Assert
    assertEquals("Goodbye Name", demoService.sayGoodbye("Name"));
  }
}

