package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//UserLogin.feature",
		glue={"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
			"html:target/reports/HtmlReport.html",
//				"usage:target/reports/UsageReport",
//				"json:target/reports/JsonReport.json",
//			    "junit:target/reports/JUnitReport.xml"
	//			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				"rerun:target/failedScenarios.txt"
			}
		
		)

public class MyTestRunner extends AbstractTestNGCucumberTests{
  
  //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
}
