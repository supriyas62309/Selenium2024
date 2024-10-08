package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	@Given("user is at login screen")
	public void user_is_at_login_screen() {
		System.out.println("given statment for login");
	   
	}

	@When("enter username")
	public void enter_username() {
		System.out.println("user name pass");
		
	   
	}

	@And("enter password")
	public void enter_password() {
		System.out.println("password name pass");
	    
	}

	@And("click on login")
	public void click_on_login() {
		System.out.println("login");
	    
	}

	@Then("user should see the home page")
	public void user_should_see_the_home_page() {
		System.out.println("home screen");
	   
	}



	
	
	
}