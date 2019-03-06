package com.poc;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloFunctionTest {

  @Test
  public void testFunction() {
    EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);
    try {
      HelloFunctionClient client = server.getApplicationContext()
          .getBean(HelloFunctionClient.class);
      String response = client.apply().blockingGet();
      Assertions.assertEquals("Hello, Micronaut serverless v1", response);
    } finally {
      server.stop();
    }
  }

}