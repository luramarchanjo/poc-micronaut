package com.poc.infra;

import com.poc.domain.Car;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Arrays;
import java.util.Collection;
import lombok.extern.slf4j.Slf4j;

@Controller("/cars")
@Slf4j
public class CarController {

  @Get
  public Collection<Car> getCars() {
    log.info("Received request /cars");
    return Arrays.asList(Car.builder().build(), Car.builder().build(), Car.builder().build());
  }

}
