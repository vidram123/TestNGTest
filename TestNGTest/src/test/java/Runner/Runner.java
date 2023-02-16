package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = "src/test/resources/Feature/Test.feature",
				glue = "stepDef" 
				)
public class Runner extends AbstractTestNGCucumberTests{
	
}