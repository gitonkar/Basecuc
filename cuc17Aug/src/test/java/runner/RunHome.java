package runner;

import base.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "classpath:Features/HomePage" }, glue = { "stepDef" }, plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunHome extends Base {

}
