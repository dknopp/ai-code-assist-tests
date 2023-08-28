package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.example.demo.components.SampleComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DemoService2.class})
@ExtendWith(SpringExtension.class)
class DemoService2DiffblueTest {
  @Autowired
  private DemoService2 demoService2;

  @MockBean
  private SampleComponent sampleComponent;
  /**
   * Method under test: {@link DemoService2#sayHello(String)}
   */
  @Test
  void testSayHello() {
    // Arrange
    when(sampleComponent.sayHello(Mockito.<String>any())).thenReturn("Say Hello");

    // Act and Assert
    assertEquals("Say Hello", demoService2.sayHello("Name"));
    verify(sampleComponent).sayHello(Mockito.<String>any());
  }

  /**
  * Method under test: {@link DemoService2#doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(int)}
  */
  @Test
  void testDoSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt() {
    // Arrange, Act and Assert
    assertEquals(0, demoService2.doSomethingWeirdAndMakeRandomWebRequestsDependingOnInputThenReturnAnInt(-1));
  }
}

