package com.springboot.example.demohelloworld.service;

import org.springframework.stereotype.Service;
import com.springboot.example.demohelloworld.service.Impl.HelloworldServiceImpl;

@Service
public class HelloworldService implements HelloworldServiceImpl {
  
  @Override
  public String generate(int x){
    if(x > 100)
      return "hello world!!!";
    return "ABC";
  }
}
