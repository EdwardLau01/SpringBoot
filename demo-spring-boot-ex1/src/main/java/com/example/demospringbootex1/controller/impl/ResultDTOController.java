package com.example.demospringbootex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demospringbootex1.controller.ResultDTOOperation;
import com.example.demospringbootex1.mapper.ResultMapper;
import com.example.demospringbootex1.model.ResultDTO;
import com.example.demospringbootex1.service.QuoteService;
import com.example.demospringbootex1.service.StockService;

@RestController
@RequestMapping(value = "/api/v1")
public class ResultDTOController implements ResultDTOOperation {

  @Autowired
  QuoteService quoteService;

  @Autowired
  StockService stockService;

  @Override
   public ResultDTO map() {

    return ResultMapper.map(stockService.findStock(), quoteService.findQuote());
   }

}
