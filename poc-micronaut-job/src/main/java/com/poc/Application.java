package com.poc;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class Application implements ApplicationEventListener<ServerStartupEvent> {

  public static void main(String... arguments) {
    Micronaut.run(Application.class);
  }

  @Override
  public void onApplicationEvent(ServerStartupEvent event) {
    log.info("Received {}", event);
  }

}