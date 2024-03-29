package com.test.api.stepdef;

import com.test.api.eventConnector.ObjectEvent;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends ObjectEvent {

	@Before
	public void before() {
		
	}

	@When(".*?call post.*? \"([^\"]*)\"$")
	public void call(String arg1) throws Throwable {
		callEvent(arg1);
	}

	@When(".*?request body:$")
	public void put_body(String arg1) throws Throwable {
		put_bodyEvent(arg1);
	}

	@Then(".*?receive status code.*? (\\d+)$")
	public void receive_status_code(int arg1) throws Throwable {
		receive_status_codeEvent(arg1);	
	}

	@Then("^the response should contain:$")
	public void the_response_should_contain(String arg1) throws Throwable {
		the_response_should_containEvent(arg1);
	}
	
	@After
	public void after() {
		
	}
}
