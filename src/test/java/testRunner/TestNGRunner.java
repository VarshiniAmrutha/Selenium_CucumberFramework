package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/*
 * @author AmruthaVarshini
 * TestRunner class is used to execute your project
 * this runner will execute the features under the suite uiFeatures
 * glue - is used to bind the gherkin steps with the stepdefinitions
 * plugin - to define where and how the test results are stored
 * tags - can be used to execute or to ignore certain scenarios
 */
@CucumberOptions(features = "src/test/resources/uiFeatures", 
glue = "steps", monochrome=true, tags = "", 
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	//This code will enable parallel execution using TestNG 
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}