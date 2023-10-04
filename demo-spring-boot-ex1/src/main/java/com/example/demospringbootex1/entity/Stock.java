package com.example.demospringbootex1.entity;

import java.time.LocalDateTime;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="finnhub_stocks")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Stock {

  @Id // primary ket
  @GeneratedValue(stratrgy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "country")
  private String country;

  @Column(name = "company_name")
  private String compantName;

  @Column(name = "ipo_date")
  private LocalDateTime ipoDate;

  @Column(name = "logo")
  private String logo;

  @Column(name = "curreny")
  private String curreny;

  @Column(name = "market_cap")
  private String marketCap;
  
}
