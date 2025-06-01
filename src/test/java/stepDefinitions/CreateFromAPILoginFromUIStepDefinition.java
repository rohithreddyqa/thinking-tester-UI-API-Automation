package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateFromAPILoginFromUIStepDefinition {
	
	@Given("the {string} and {string} for created user")
	    public void the_and_for_created_user(String email, String password) {
	        System.out.println("Email: " + email);
	        System.out.println("Password: " + password);
	        // Add logic to use the email and password, e.g., storing them for later use
	    }
	@When("the user the navigates to the {string} and enters the {string} and {string}")
	public void the_user_the_navigates_to_the_and_enters_the_and(String string, String string2, String string3) {
	    
	}
	@When("the user clicks the submit button to login")
	public void the_user_clicks_the_submit_button_to_login() {
	    
	}
	@Then("the user lands into the homepage")
	public void the_user_lands_into_the_homepage() {
	    
	}


}
