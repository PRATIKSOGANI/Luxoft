package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\lenovo\\eclipse-workspace\\Luxoft\\src\\main\\java\\Features"
		,glue = {"stepDefinitionsUBS"},
		dryRun=false,
		monochrome=true,
		format = {"pretty", "html:test-output", "junit:junit-xml/cucmber.xml"}
		)

public class TestRunner {
	
	

}
