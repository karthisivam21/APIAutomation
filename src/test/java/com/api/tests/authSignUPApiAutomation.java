package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.signUPRequest;
import com.api.models.response.signUpResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.apiListeners.class)
public class authSignUPApiAutomation {
	
	@Test(description ="verrify signUP is working using Builder")
	public void signUpAPI()
	{
		signUPRequest signUPReq = new signUPRequest.Builder()
				.Email("newuser@example.com")
				.FullName("New User")
				.PhoneNumber("9415128845")
				.Password("12345")
				.ConfirmPassword("12345")
				.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUPAPI(signUPReq);
		signUpResponse signupRes = response.as(signUpResponse.class) ;
		
		System.out.println(response.asPrettyString());
		System.out.println(signupRes.getData());
		
		Assert.assertTrue(signupRes.getError()==null);
		System.out.println(response.getStatusCode());
		
	}

}
