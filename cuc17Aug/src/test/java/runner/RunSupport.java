package runner;

import base.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "classpath:Features/SupportPage" }, glue = { "stepDef" }, plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class RunSupport extends Base {

}
