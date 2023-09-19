package com.example.demospringbootex1.exception;

import com.example.demospringbootex1.infra.BusinessException;
import com.example.demospringbootex1.infra.Code;

public class FinnhubException extends BusinessException{
  
  public FinnhubException(Code code){
    super(code);
  }
  
}
