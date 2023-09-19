package com.example.demospringbootex1.service;

import com.example.demospringbootex1.model.Quote;

public interface QuoteService {
  
  Quote findQuote(); //throws BusinessException;
}
