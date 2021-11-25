package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\SeleniumProjectsWorkspace\\CucumberNaveen\\CucumberNaveen\\src\\test\\java\\features\\Hooks.feature", 
		glue = "stepDefinitions", 
		plugin = {"pretty", "html:test-output", "junit:test-output/JenkinsReport"}, 
		dryRun = false, 
		strict = true,
		monochrome = true)
		//tags = {"@EndtoEnd", "~@Regression", "~@Smoke"})
		

public class TestRunner {

}
