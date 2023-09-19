package com.example.demospringbootex1.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.demospringbootex1.infra.ApiResponse;
import com.example.demospringbootex1.infra.Code;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = FinnhubException.class)
  public ResponseEntity<ApiResponse<Void>> jphExceptionHandler() {
    ApiResponse<Void> response = ApiResponse.<Void>builder() //
        .status(Code.FINN_NOTFOUND) //
        .data(null) //
        .build();
    return ResponseEntity.badRequest().body(response);
  }
}
