package com.springboot.example.demohelloworld.controller.Impl;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloworldControllerImpl {
  @GetMapping(value = "/hello")
  public String hello();
}
