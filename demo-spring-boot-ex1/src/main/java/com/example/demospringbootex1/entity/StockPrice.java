package com.example.demospringbootex1.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="finnhub_stock_prices")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StockPrice {

  @Id // primary ket
  @GeneratedValue(stratrgy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "stock_id")
  private String stockId;

  @Column(name = "date_time")
  private LocalDateTime dateTime;

  @Column(name = "current_price")
  private double currentPrice;

  @Column(name = "day_high")
  private double marketCdayHighap;

  @Column(name = "day_low")
  private double dayLow;

  @Column(name = "day_open")
  private double dayOpen;

  @Column(name = "perv_day_close")
  private double pervDayClose;




}
