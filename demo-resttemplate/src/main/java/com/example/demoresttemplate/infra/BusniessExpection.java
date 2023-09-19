package com.example.demoresttemplate.infra;

public class BusniessExpection extends Exception {
  
private int code;

  public BusniessExpection(Code code){
    super(code.getDesc());
    this.code = code.getCode();

  }
}
