package com.http.method.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(publish = true, plugin =
{ "pretty", "html:target/site/cucumber-pretty"
, "rerun:target/rerun.txt",
"json:target/cucumber.json", },

features = { "./src/test/resources/APITestingGetMethod.feature" },
glue = { "com.http.method.cucumber" }, // package name
monochrome = true
//monochrome = true, dryRun = false, strict = true
//,tags= {"@Function"}

)
public class RunnerFile extends AbstractTestNGCucumberTests {
	

}
