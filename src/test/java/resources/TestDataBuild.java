package resources;

import pojo.AddPlaceRequest;
import pojo.LoginAPIRequest;

public class TestDataBuild {
	
	public AddPlaceRequest AddPlacePayLoad(String firstName, String lastName, String email, String password) {
		
		AddPlaceRequest apr = new AddPlaceRequest();
		apr.setFirstName(firstName);
		apr.setLastName(lastName);
		apr.setEmail(email);
		apr.setPassword(password);
		return apr;
		
	}
	
	public LoginAPIRequest LoginAPIPayLoad(String email, String Password) {
		
		LoginAPIRequest lpr = new LoginAPIRequest();
		lpr.setEmail(email);
		lpr.setPassword(Password);
		return lpr;
		
	}

}
