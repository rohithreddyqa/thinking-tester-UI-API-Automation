package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class AddUserStepDefinition extends Utils{
	
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild testdata = new TestDataBuild();
	
	@Given("Add a user Payload with {string} {string} {string} {string}")
	public void add_a_user_payload_with(String firstName, String lastName, String email, String password) throws IOException {
	    
		reqspec= given().spec(requestSpecification()).body(testdata.AddPlacePayLoad(firstName, lastName, email, password));
	    
	}
	@When("user calls {string} with the {string} http request")
	public void user_calls_with_the_http_request(String api, String method) {
	    
		APIResources resources = APIResources.valueOf(api);
		System.out.println(resources.getResource()); /*returns the method used (add, login etc) which is declared in enum*/
		
		
		
		if(method.equalsIgnoreCase("post")) {
			response = reqspec.when().post(resources.getResource());
		}
//		else {
//			response = resspec.when().get(resources.getResource()); /*returns the get call by creating the user*/
//		}
//		
	   
	}
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	   
		
		resspec = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		assertEquals(response.getStatusCode(), 201);/*extracting the status code from the response*/
	   
	}
	


}
