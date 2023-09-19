package com.example.demoresttemplate.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demoresttemplate.infra.BusniessExpection;
import com.example.demoresttemplate.infra.Code;
import com.example.demoresttemplate.infra.Protocol;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.service.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class UserServiceImpl implements UserService { //bean

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.jsonplaceholder.domain}")
  private String jphDomain; // from yml

  @Value(value = "${api.jsonplaceholder.endpoints.users}")
  private String userEndpoint; // from yml

  @Override
  public List<User> findAll() throws BusniessExpection{
    String url = UriComponentsBuilder.newInstance() //
    .scheme(Protocol.HTTPS.name()) //
    .host(jphDomain) //
    .path(userEndpoint) //
    .toUriString();

System.out.println("url=" + url);
// Invoke API + Jaskson Deserialization (JSON -> Object)
try {
  User[] users = restTemplate.getForObject(url, User[].class);
  return Arrays.asList(users);
} catch (RestClientException e) {
  throw new BusniessExpection(Code.JPH_NOTFOUND);
    }
    
  }

  @Override
  public User findUser(long id) {
    List<User> users = findAll();
    Optional<User> user = users.stream()//
    .filter(e -> e.getId() == id)
    .findFirst()
    
  }

}
