package com.example.demoresttemplate.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demoresttemplate.infra.ApiResponse;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.model.UserDTO;

public interface UserOperation {

  @GetMapping(value = "/allusers")
  ResponseEntity<ApiResponse<List<UserDTO>>> findAll() throws Exception;

  @GetMapping(value = "/user")
  User findUser(@RequestParam long id);

}
