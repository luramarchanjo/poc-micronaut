package com.poc.infra;

import com.poc.domain.Car;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;
import java.util.Collection;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;

@Controller("/booking")
@Slf4j
public class BookingController {

  @Client(id = "service-one")
  @Inject
  private RxHttpClient rxHttpClient;

  @Get
  public Collection<Car> getCars() {
    Flowable<HttpResponse<Collection>> exchange = rxHttpClient.exchange("/cars", Collection.class);
    HttpResponse<Collection> httpResponse = exchange.blockingFirst();
    return (Collection<Car>) httpResponse.body();
  }

}
