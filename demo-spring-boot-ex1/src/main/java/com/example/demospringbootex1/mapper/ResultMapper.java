package com.example.demospringbootex1.mapper;

import com.example.demospringbootex1.model.Quote;
import com.example.demospringbootex1.model.Stock;
import com.example.demospringbootex1.model.ResultDTO;

public class ResultMapper {

  public static ResultDTO map(Stock stock, Quote quote) {
    
    return ResultDTO.builder() //
    .companyProfile( //
    ResultDTO.CompanyProfile.builder() //
    .country(stock.getCountry())
    .companyName(stock.getName())
    .ipoDate(stock.getIpo())
    .marketCap(stock.getMarketCapitaliztion())
    .currency(stock.getCurrency())
    .build()
    ) //
    .currentPrice(quote.getC()) //
    .dayHigh(quote.getH()) //
    .dayLow(quote.getL()) //
    .dayOpen(quote.getO()) //
    .prevDayClose(quote.getPc()) //
    .build();
  }
}

  // public class StockDTO {
  //   CompanyProfile companyProfile;
  //   private double currentPrice;
  //   private double dayHigh;
  //   private double dayLow;
  //   private double dayOpen;
  //   private double prevDayClose;
  // }
  // public static class CompanyProfile {
  //   private String country;
  //   private String companyName;
  //   private LocalDate ipoDate;
  //   private String logo;
  //   private String marketCap;
  //   private String currency;
  // }
