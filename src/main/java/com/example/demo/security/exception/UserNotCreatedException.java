package com.example.demo.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class UserNotCreatedException extends AuthenticationServiceException {

  public UserNotCreatedException(String msg) {
    super(msg);
  }
}
