package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	private static final String baseUrl = "https://www.quickpickdeal.com";
	private RequestSpecification reqSpc; 
	
	public BaseService() {
		reqSpc = RestAssured.given().baseUri(baseUrl);
	}
	
	protected Response postRequesst(String payLoad, String endPoint)
	{
		return reqSpc
				.contentType(ContentType.JSON)
				.body(payLoad)
			.when()
				.post(endPoint);
	}
	
	protected Response postRequesst(Object payLoad, String endPoint)
	{
		return reqSpc
				.contentType(ContentType.JSON)
				.body(payLoad)
			.when()
				.post(endPoint);
	}
	

}
