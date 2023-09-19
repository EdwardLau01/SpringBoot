package com.example.demospringbootex1.infra;

import lombok.Getter;

@Getter
public enum Code {
  OK(20000, "OK"),
  // 40000 - 49999
  NOTFOUND(40000, "Resource NOT FOUND"),
  FINN_NOTFOUND(40001, "Finnhub RestClientException"),
  // Server
  SERVER_TIMEOUT(50000, "Server Timeout"),
  ;

  private int code;
  private String desc;

  private Code(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
