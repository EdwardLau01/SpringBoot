package com.example.demospringbootex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demospringbootex1.model.Quote;

public interface QuoteOperation {

  @GetMapping(value = "/quote")
  Quote findQuote(@RequestParam String symbol) throws Exception;//throws Exception;
  // ResponseEntity<ApiResponse<List<Quote>>> findQuote() throws Exception;
}
