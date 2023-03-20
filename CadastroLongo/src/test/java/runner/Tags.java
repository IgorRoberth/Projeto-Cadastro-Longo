package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "executa",
		tags = "@todos",
		dryRun = false,
		plugin = {"pretty", "html:target/report.html"},
		monochrome = true
		
		)
public class Tags {
}