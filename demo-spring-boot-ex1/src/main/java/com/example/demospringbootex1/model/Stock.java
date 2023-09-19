package com.example.demospringbootex1.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
  private String country;
  private String currency;
  private String exchange;
  private LocalDate ipo;
  private String marketCapitaliztion;
  private String name;
  private String phone;
  private double shareOutsStanding;
  private String ticker;
  private String weburl;
  private String logo;
  private String finnhubIndustry;;


}
