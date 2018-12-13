package com.poc;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

  @Get
  public String get() {
    return "Hello Micronaut";
  }

}