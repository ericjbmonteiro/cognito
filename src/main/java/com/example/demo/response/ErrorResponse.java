package com.example.demo.response;

import java.util.Date;
import org.springframework.http.HttpStatus;

public class ErrorResponse {

  private final HttpStatus status;
  private final String message;
  private final ErrorCode errorCode;
  private final Date timestamp;

  public ErrorResponse(final String message, final ErrorCode errorCode, HttpStatus status) {
    this.message = message;
    this.errorCode = errorCode;
    this.status = status;
    this.timestamp = new java.util.Date();
  }

  public static ErrorResponse of(
      final String message, final ErrorCode errorCode, HttpStatus status) {
    return new ErrorResponse(message, errorCode, status);
  }

  public Integer getStatus() {
    return status.value();
  }

  public String getMessage() {
    return message;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }

  public Date getTimestamp() {
    return timestamp;
  }
}
