package runner;

import base.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "classpath:Features/Suite2" }, glue = { "stepDef" }, plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Run2 extends Base {

}
