package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Listeners(com.api.listeners.apiListeners.class)
public class authApiAutomation {
	
	@Test(description = "Verify if login is working")
	public void loginAPIBasic()
	{
        String loginPayload = "{ \"email\": \"testuser@example.com\", \"password\": \"12345\" }";

		Response response = RestAssured
			.given()
				.baseUri("https://www.quickpickdeal.com")
				.header("Content-Type","application/json")
				.body(loginPayload)
			.when()
				.post("/api/auth/login");
			
		System.out.println(response.asPrettyString());
	}
	

	@Test(description = " Verify Login through SOP Framework")
	public void loginAPISOP()
	{
        String loginPayload = "{ \"email\": \"testuser@example.com\", \"password\": \"12345\" }";
        
		AuthService authService = new AuthService();
		Response response = authService.loginAPI(loginPayload);
		System.out.println(response.asPrettyString());
	}
	
	@Test(description = "verify login API is working via SOP framwork with POJO request with serialization")
	public void LoginAPIPOJOSerialization()
	{
		LoginRequest payLoad = new LoginRequest("testuser@example.com", "123456");
		
		AuthService authService = new AuthService();
		Response response = authService.loginAPI(payLoad);
		System.out.println(response.asPrettyString());
	}

	@Test(description = "Verify Login API with SOP framework , POJO, Serilization and deserilization ")
	public void LoginAPIDeSerialize()
	{
		LoginRequest payLoad = new LoginRequest("testuser@example.com", "12345");
		
		AuthService authService = new AuthService();
		Response response = authService.loginAPI(payLoad);
		System.out.println(response.asPrettyString());

		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(loginResponse.getData());
		
		Assert.assertTrue(loginResponse.isSuccess());

	}
	

	@Test(description = "Verify Login API with invalid Credentials")
	public void LoginAPIInvalidCredntial()
	{
		LoginRequest payLoad = new LoginRequest("testuser@example.com", "123456");
		
		AuthService authService = new AuthService();
		Response response = authService.loginAPI(payLoad);
		System.out.println(response.asPrettyString());

		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(loginResponse.getData());
		
		Assert.assertTrue(loginResponse.isSuccess());

	}
}
