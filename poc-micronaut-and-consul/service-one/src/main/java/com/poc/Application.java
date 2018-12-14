package com.poc;

import io.micronaut.runtime.Micronaut;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

  public static void main(String... arguments) {
    Micronaut.run(Application.class);
  }

}