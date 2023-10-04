package com.example.demospringbootex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demospringbootex1.controller.QuoteOperation;
import com.example.demospringbootex1.model.Quote;
import com.example.demospringbootex1.service.QuoteService;

@RestController
@RequestMapping(value = "/api/v1")
public class QuoteController implements QuoteOperation {

  @Autowired
  QuoteService quoteService;

  // @Override
  // public ResponseEntity<ApiResponse<List<Stock>>> findStock() throws Exception{
  // List<Stock> stocks = stockService.findStock();

  // // Conversion (user -> userDTO)
  // List<StockDTO> stockDTOs = stocks.stream() //
  // .map(stock -> StockMapperMapper.map(stock)) //
  // .collect(Collectors.toList());

  // ApiResponse<List<StockDTO>> response = ApiResponse.<List<StockDTO>>builder() //
  // .ok() //
  // .data(stockDTOs) //
  // .build();
  // return ResponseEntity.ok().body(response);
  // }

  @Override
  public Quote findQuote(String symbol) throws Exception{// throws Exception{
    return quoteService.findQuote(symbol);
  }
}

