package com.app.dinesh.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    public AuthenticationResponse(String authenticationToken2, String username2) {
		// TODO Auto-generated constructor stub
	}
	private String authenticationToken;
    private String username;
}
