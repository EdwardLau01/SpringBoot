package com.example.demospringbootex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demospringbootex1.model.Quote;

public interface QuoteOperation {

  @GetMapping(value = "/quote")
  Quote findQuote();//throws Exception;
  // ResponseEntity<ApiResponse<List<Quote>>> findQuote() throws Exception;
}
