package com.example.demoresttemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // Getter + NO-args constructor
@AllArgsConstructor
@NoArgsConstructor // Jaskson
@Builder
public class UserDTO {

private long id;
  private String name;
  @JsonProperty("x")
  private String username;
}
  




