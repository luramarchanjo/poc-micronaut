package com.poc;

import io.micronaut.scheduling.annotation.Scheduled;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class Job {

  @Scheduled(initialDelay = "1s",  fixedDelay = "5s")
  public void execute() {
    log.info("Executed job");
  }

}
