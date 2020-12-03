package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources"},// if I specify including feature I'm getting initialization exception
		glue= {"stepDefinitions"},
		plugin= {"pretty"}
		
		)

public class AmezonSearchTest {// Yes this class working fine 

}
