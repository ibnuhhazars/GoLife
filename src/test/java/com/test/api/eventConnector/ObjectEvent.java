package com.test.api.eventConnector;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ObjectEvent {
	
	private RequestSpecification request = RestAssured.given();
	private Response response;

	public void callEvent(String arg1) throws Throwable {
		setResponse(getRequest().post(arg1));
	}
	
	public void put_bodyEvent(String arg1) throws Throwable {
		getRequest().header("Content-Type", "application/json");
		getRequest().body(arg1);
	}
	
	public void receive_status_codeEvent(int arg1) throws Throwable {
		int code = getResponse().getStatusCode();
		Assert.assertEquals(arg1, code);
	}
	
	public void the_response_should_containEvent(String arg1) throws Throwable {
		Assert.assertEquals(arg1, getResponse().getBody().asString());
	}
	
	public RequestSpecification getRequest() {
		return request;
	}

	public void setRequest(RequestSpecification request) {
		this.request = request;
	}
	
	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
}
