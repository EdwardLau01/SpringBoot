package com.example.demospringbootex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demospringbootex1.model.Stock;

public interface StockOperation {
  
  @GetMapping(value = "/stock")
  Stock findStock();//throws Exception;
  // ResponseEntity<ApiResponse<List<Stock>>> findStock() throws Exception;

}
