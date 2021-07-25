package com.example.demo.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class AuthenticationFailedException extends AuthenticationServiceException {

  public AuthenticationFailedException(String msg) {
    super(msg);
  }
}
