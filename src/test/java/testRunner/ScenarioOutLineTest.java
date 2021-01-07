package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// this class is for we can execute all the features and single feature files also 
@CucumberOptions(		// And By using this class we can execute from pom.xml file and command prompt
		
		features = {"src/test/resources/appFeatures/ScenarioOutLine.feature"},
		glue= {"stepDefinitions"},// in this we can provide the path of the stepDefinito file and Hooks also 
		plugin = {"pretty"}
		// Any other things I will update later on 
		// later on I will update this features 
		
		)
public class ScenarioOutLineTest {

}
