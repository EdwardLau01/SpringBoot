package com.example.demospringbootex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demospringbootex1.model.ResultDTO;

public interface ResultDTOOperation {
  
  @GetMapping(value = "/result")
  ResultDTO map();
}
