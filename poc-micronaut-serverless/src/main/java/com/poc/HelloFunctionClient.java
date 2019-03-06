package com.poc;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface HelloFunctionClient {

  @Named("hello")
  Single<String> apply();

}