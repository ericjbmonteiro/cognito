package com.example.demo.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class JwtExpiredTokenException extends AuthenticationServiceException {

  public JwtExpiredTokenException(String msg) {
    super(msg);
  }
}
