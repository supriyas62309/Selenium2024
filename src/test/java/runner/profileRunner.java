package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = {"src\\test\\resources\\application\\profile.feature"},
			
			glue = {"steps","hooks"},
			
			plugin = {"pretty"}
	
	
)

public class profileRunner extends AbstractTestNGCucumberTests{

}
