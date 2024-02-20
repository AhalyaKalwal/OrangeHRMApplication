package com.StepDefination;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",glue="com.StepDefination",monochrome=true,
//tags="@ReTesting"
                // dryRun=true 
//tags="@Smoke"
//tags="@Smoke,@ReTesting"
plugin = { "pretty",
"html:target/OrangeHRMApplicationReports",
"json:target/OrangeHRMApplicationJsonReport.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
}
)
                                      

public class TestRunner {

	
}
