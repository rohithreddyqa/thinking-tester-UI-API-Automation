package cucumber.Options;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue= {"stepDefinitions"}, monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	

}
