package com.example.demo.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class NewPasswordRequiredException extends AuthenticationServiceException {

  public NewPasswordRequiredException(String msg) {
    super(msg);
  }
}
