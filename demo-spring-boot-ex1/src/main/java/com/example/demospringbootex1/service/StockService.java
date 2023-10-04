package com.example.demospringbootex1.service;

import com.example.demospringbootex1.infra.BusinessException;
import com.example.demospringbootex1.model.Stock;

public interface StockService {
  
  Stock findStock(String symbol)throws BusinessException; //throws BusinessException;
}
