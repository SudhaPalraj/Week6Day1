package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/feature/Login.feature","src/test/java/feature/CreateLead.feature"},glue="steps",monochrome=true,publish=true)

public class CucumberRunner extends AbstractTestNGCucumberTests {

	
	
	
}
