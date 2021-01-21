package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/HT Series/eclipse-workspace/teste-qa-trade/src/test/java/Features/",
				snippets = SnippetType.CAMELCASE,
				tags = "@AutomatizarRotina",
				glue = {"StepDefinitions"},
				plugin = {"pretty","html:target/report-html" , "json:target/report.json"},
				monochrome = true,
				dryRun = false,
				strict = false
				) 
public class MyRunner {
	
	
}