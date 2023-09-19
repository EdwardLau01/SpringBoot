package com.example.demoresttemplate.exception;

import com.example.demoresttemplate.infra.BusniessExpection;
import com.example.demoresttemplate.infra.Code;

public class JPHException extends BusniessExpection{
  
    public JPHException(Code code) {
    super(code);
  }
  
}
