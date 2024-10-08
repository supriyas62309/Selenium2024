package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {
	
	
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
		System.out.println("given statment");
	    
	}

	@When("user enters name as {string} in the form")
	public void user_enters_name_as_in_the_form(String string) {
		System.out.println("Enter the username:"+ string);
	   
	}

	@When("user enterd the age {int}")
	public void user_enterd_the_age(Integer int1) {
	    
		System.out.println("Enter the age:"+ int1);
	}

	@When("user confirms the gender as {string}")
	public void user_confirms_the_gender_as(String string) {
		System.out.println("enter the gender"+ string);
	    
	}

	@Then("user will get created")
	public void user_will_get_created() {
		System.out.println("scenario created");
	    
	}


}
