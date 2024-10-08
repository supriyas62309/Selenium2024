package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\application\\login.feature"},
		
		glue = {"steps"},
		
		plugin= {"pretty"}
		
		
		)




public class loginrunner extends AbstractTestNGCucumberTests{

}
