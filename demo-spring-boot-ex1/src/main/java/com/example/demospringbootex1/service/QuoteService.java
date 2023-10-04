package com.example.demospringbootex1.service;

import com.example.demospringbootex1.infra.BusinessException;
import com.example.demospringbootex1.model.Quote;

public interface QuoteService {
  
  Quote findQuote(String symbol)throws BusinessException; //throws BusinessException;
}
