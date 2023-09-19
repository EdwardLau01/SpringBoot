package com.example.demoresttemplate.service;

import java.util.List;
import com.example.demoresttemplate.infra.BusniessExpection;
import com.example.demoresttemplate.model.User;

public interface UserService {
  
  List<User> findAll() throws BusniessExpection;

  User findUser(long id);

}
