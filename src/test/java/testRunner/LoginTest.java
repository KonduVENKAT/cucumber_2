package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	//	features= {"src/test/resources/login.feature"},
	//	glue= {"stepDefinitions"},
	//	plugin= {"pretty"}
		
		
		features= {"src/test/resources"},
		glue= {"stepDefinitions"},
		plugin= {"pretty"}
		
		)

public class LoginTest {

}
