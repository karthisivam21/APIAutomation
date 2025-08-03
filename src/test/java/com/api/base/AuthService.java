package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final String authBasePath ="/api/auth/";
	
	public Response loginAPI(String payLoad)
	{
		return postRequesst(payLoad, authBasePath+"login");
	}

	public Response loginAPI(Object payLoad) {
		// TODO Auto-generated method stub
		return postRequesst(payLoad, authBasePath+"login");
	}

	public Response signUPAPI(Object payLoad) {
		// TODO Auto-generated method stub
		return postRequesst(payLoad, authBasePath+"registration");
	}
	
}
