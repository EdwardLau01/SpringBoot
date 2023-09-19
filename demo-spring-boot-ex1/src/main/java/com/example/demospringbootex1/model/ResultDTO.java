package com.example.demospringbootex1.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultDTO {
  private CompanyProfile companyProfile;
  private double currentPrice;
  private double dayHigh;
  private double dayLow;
  private double dayOpen;
  private double prevDayClose;

  @Getter
  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  public static class CompanyProfile {
    private String country;
    private String companyName;
    private LocalDate ipoDate;
    private String logo;
    private String marketCap;
    private String currency;
  }
}
