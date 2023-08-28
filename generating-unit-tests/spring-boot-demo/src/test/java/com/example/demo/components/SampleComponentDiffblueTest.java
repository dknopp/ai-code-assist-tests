package com.example.demo.components;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SampleComponent.class})
@ExtendWith(SpringExtension.class)
class SampleComponentDiffblueTest {
  @Autowired
  private SampleComponent sampleComponent;
  /**
   * Method under test: {@link SampleComponent#sayHello()}
   */
  @Test
  void testSayHello() {
    // Arrange, Act and Assert
    assertEquals("Hello World", sampleComponent.sayHello());
    assertEquals("Hello Name", sampleComponent.sayHello("Name"));
  }

  /**
  * Method under test: {@link SampleComponent#sayGoodbye()}
  */
  @Test
  void testSayGoodbye() {
    // Arrange, Act and Assert
    assertEquals("Goodbye World", sampleComponent.sayGoodbye());
    assertEquals("Goodbye Name", sampleComponent.sayGoodbye("Name"));
  }
}

