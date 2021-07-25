package com.example.demo.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class JwtInvalidTokenException extends AuthenticationServiceException {

  public JwtInvalidTokenException(String msg) {
    super(msg);
  }
}
