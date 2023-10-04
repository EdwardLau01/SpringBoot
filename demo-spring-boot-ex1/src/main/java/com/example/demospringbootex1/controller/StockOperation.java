package com.example.demospringbootex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demospringbootex1.model.Stock;

public interface StockOperation {
  
  @GetMapping(value = "/stock")
  Stock findStock(@RequestParam String symbol) throws Exception;//throws Exception;
  // ResponseEntity<ApiResponse<List<Stock>>> findStock() throws Exception;

}
