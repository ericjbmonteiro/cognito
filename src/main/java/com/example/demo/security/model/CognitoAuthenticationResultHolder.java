package com.example.demo.security.model;

import com.amazonaws.services.cognitoidp.model.AuthenticationResultType;
import org.springframework.stereotype.Component;

@Component
public class CognitoAuthenticationResultHolder {
	private AuthenticationResultType authResult;

	public AuthenticationResultType getAuthResult() {
		return authResult;
	}

	public void setAuthResult(AuthenticationResultType authResult) {
		this.authResult = authResult;
	}

}
