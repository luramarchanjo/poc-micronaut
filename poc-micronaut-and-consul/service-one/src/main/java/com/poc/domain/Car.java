package com.poc.domain;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

  @Builder.Default
  private String id = UUID.randomUUID().toString();

  @Builder.Default
  private String name = UUID.randomUUID().toString();

}
