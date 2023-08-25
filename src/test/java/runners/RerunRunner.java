package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
	features="@target/failedScenarios.txt",
			glue={"stepDefs"},
			dryRun=false,
			monochrome=true,
			plugin= {"pretty",
					"rerun:target/failedScenarios.txt"
				}
	)
	public class RerunRunner extends AbstractTestNGCucumberTests{
}
