package com.example.demo.security.auth;

public interface TokenExtractor {
	public String extract(String payload);
}
