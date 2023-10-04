package com.example.demospringbootex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demospringbootex1.controller.StockOperation;
import com.example.demospringbootex1.model.Stock;
import com.example.demospringbootex1.service.StockService;

@RestController
@RequestMapping(value = "/api/v1")
public class StockController implements StockOperation {

  @Autowired
  StockService stockService;

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
  public Stock findStock(String symbol) throws Exception{// throws Exception{
    return stockService.findStock(symbol);
  }

}

