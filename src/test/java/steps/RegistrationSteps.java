package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
		System.out.println("given statment");
	   
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists();
		List<String> firstIndexlist = data.get(0);
		String value = firstIndexlist.get(2);
		System.out.println(value);
	   
	}

	@Then("user get registration confirmation")
	public void user_get_registration_confirmation() {
System.out.println("given statment");	    
	}

}
