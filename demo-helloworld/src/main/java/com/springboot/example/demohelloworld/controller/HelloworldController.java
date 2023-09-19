package com.springboot.example.demohelloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springboot.example.demohelloworld.controller.Impl.HelloworldControllerImpl;
import com.springboot.example.demohelloworld.service.HelloworldService;
import com.springboot.example.demohelloworld.service.Impl.HelloworldServiceImpl;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1") // version 1 api set // "/"
public class HelloworldController implements HelloworldControllerImpl {

  @Autowired
  HelloworldServiceImpl helloworldService;

  @Override
  public String hello() {
    // HelloworldServiceImpl helloworldServiceImpl = new HelloworldControllerImpl();
    return helloworldService.generate(102);
  }
}
