package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\application\\Registration.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		dryRun = true
		
		
		)
public class RegistrationRunner extends AbstractTestNGCucumberTests{

}
