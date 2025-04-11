package resources;

public enum APIResources {
	
	AddUser("/users"),
	LoginUser("/users/login"),
	LogoutUser("users/logout"),
	GetorPatchUser("/users/me");
	
	
	
	private String resource;
	
	
	APIResources(String resource) {
		
		this.resource=resource;
		
	}
	
	public String getResource() {
		return resource;
	}
	
	
	

}
