package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features1",
					glue="stepDefination1")

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
