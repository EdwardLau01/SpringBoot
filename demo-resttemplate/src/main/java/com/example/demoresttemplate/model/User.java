package com.example.demoresttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// @Data
@Getter // Getter + NO-args constructor
@AllArgsConstructor
@NoArgsConstructor // Jaskson
@Builder
public class User {
  private long id;
  private String name;
  private String username;
  private String email;
  private Address Address;
  private String phone;
  private String website;
  private Company company;

    //@Data
   //@AllArgsConstructor
   //@NoArgsConstructor
  @Getter
  public static class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    //@Data
    //@AllArgsConstructor
    //@NoArgsConstructor
    @Getter
    public static class Geo {
      private String lat;
      private String lng;
    }
  }

  // @Data
  // @AllArgsConstructor
  // @NoArgsConstructor
  @Getter
  public static class Company {
    private String name;
    private String catchPhrase;
    private String bs;
  }
}


