package com.poc;

import io.micronaut.context.annotation.Value;
import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@FunctionBean("hello")
public class HelloFunction implements Supplier<String> {

  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  @Value("${application.message}")
  private String message;

  @Override
  public String get() {
    LOG.info("Received a request");
    return "Hello, " + message;
  }

}