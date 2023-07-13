package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		
		features = "/Users/sonali/eclipse-workspace/SonaliCucumber/src/test/resources/feature/document.feature",
		
		glue = {"testcases"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"junit:src/test/java/reports/report.xml",
				"json:target/JSONReports/report.json",
				"html:src/test/java/reports/report.html"
				},
		publish = true
		
		
		)
public class Runner
{

	
}
