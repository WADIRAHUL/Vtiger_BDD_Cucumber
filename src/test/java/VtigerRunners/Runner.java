package VtigerRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {".\\src\\test\\java\\Features"},
		glue = {"StepDefinationsAndHooksClasses"},
		dryRun = false, // for true it just checks step-definition mapping. 
		monochrome = true, // Makes console output clean and readable.
		tags = "",
		plugin = {
				"pretty", // Prints steps in readable format in console.
				"html:VtigerCucumber.html",
				"json:VtigerCucumber.json"
		}
		
		)


public class Runner extends AbstractTestNGCucumberTests{

}
