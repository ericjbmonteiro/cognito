package com.example.demo.controller;

import com.example.demo.security.auth.JwtAuthenticationToken;
import com.example.demo.security.model.UserContext;
import java.security.Principal;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class DemoController {

  @GetMapping
  public String teste(JwtAuthenticationToken token) {
    UserContext user = (UserContext) token.getPrincipal();
    return "User: " + user.getUsername() + " logado";
  }
}
