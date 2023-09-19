package com.example.demoresttemplate.mapper;

import com.example.demoresttemplate.model.UserDTO;
import com.example.demoresttemplate.model.User;

public class UserMapper {

  public static UserDTO map(User user) {
    return UserDTO.builder() //
        .id(user.getId()) //
        .name(user.getName()) //
        .username(user.getUsername()) //
        .build();
  }
}
