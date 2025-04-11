package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class LoginUserStepDefinition extends Utils{
	
	RequestSpecification req;
	ResponseSpecification res;
	Response resp;
	TestDataBuild testdata = new TestDataBuild();
	
	@Given("login a user with {string} {string}")
	public void login_a_user_with(String email, String password) throws IOException {
		
		req = given().spec(requestSpecification().body(testdata.LoginAPIPayLoad(email, password)));

	}

	@When("the user calls {string} with the {string} http request")
	public void the_user_calls_with_the_http_request (String loginUser, String method){
		APIResources resources = APIResources.valueOf(loginUser);
		System.out.println(resources.getResource());
		
		if(method.equalsIgnoreCase("post")) {
			resp = req.when().post(resources.getResource());
		}
	}
	
	
	
	@Then("the LoginAPI call got success with status code {int}")
	public void the_loginapi_call_got_success_with_status_code(Integer int1) {
	   
		assertEquals(resp.getStatusCode(), 200);/*extracting the status code from the response*/
	   
	}

}
