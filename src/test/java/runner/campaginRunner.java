package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\application\\campagin.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty"},
		
		tags = "@Sanity"
		
		
		
		)

public class campaginRunner extends AbstractTestNGCucumberTests{

}
