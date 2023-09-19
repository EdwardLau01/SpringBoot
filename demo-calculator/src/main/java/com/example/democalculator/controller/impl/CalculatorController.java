package com.example.democalculator.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.democalculator.controller.CalculatorOperation;
import com.example.democalculator.service.CalculatorService;

// @Controller  // @Controller must be add in the class
// @ResponseBody
@RestController // @Controller + @ResponseBody
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation{
  
  @Autowired
  CalculatorService calculatorService; // like -- List<String> list;

  @Override
  public List<String> String(){
    return calculatorService.getStrings();
  }

  @Override
  public Integer add (int salary, int bnous, String dividend, int k){
    int d = 1;
    try{
    Integer.valueOf(dividend);
    } catch (NumberFormatException e) {
      d = 0;
    }
    return calculatorService.add(salary + bnous , d + k);
  }

  @Override
  public Integer substract (int salary, int y, String z){
    return calculatorService.substract(salary - y , 0);
  }
}
