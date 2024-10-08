package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class profileOperations {
	@Given("user should present on home page")
	public void user_should_present_on_home_page() {
	 System.out.println("given statment");   
	}

	@When("user clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
		 System.out.println("Add Profile"); 
	    
	}

	@When("user enters the data")
	public void user_enters_the_data() {
		 System.out.println("addition of data"); 
	    
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
		 System.out.println("profile creation"); 
	    
	}

	@When("user clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
		 System.out.println("Edit profile"); 
	    
	}

	@When("user updates the data")
	public void user_updates_the_data() {
		 System.out.println("Modification of data"); 
	    
	}

	@Then("profile should get modified")
	public void profile_should_get_modified() {
		 System.out.println("profile updation"); 
	    
	}

	@When("user clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
		 System.out.println("delet profilet"); 
	   
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		 System.out.println("profile deletion"); 
	}

}
