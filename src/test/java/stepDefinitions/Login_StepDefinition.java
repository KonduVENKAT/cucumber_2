package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_StepDefinition {


@Given("when user in login page")
public void when_user_in_login_page() {

System.out.println("Step-1__ this is testing about data Driven by using cucuber framewrok How to implement this feature ");
}

@When("Enters the given data")
public void enters_the_given_data(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
	// How to implement this feature data table from cucumber BDD framework how to do this thing
	
	//List<String> list=dataTable.asList();// this will work I will check about this Weather it is work or not 
	 List<List<String>> li=dataTable.asLists(String.class);
	
	 // In the above I have to convert DataTable in cucumber.on package into asLists(String.class); Each value in that data table into String type  
	 
	 
	 for(List<String> ele:li)// In this case Here  I have one more List is available in that element 
	{			// in ele is return one list Type data And that ele into convert into String type in this case  
		 for(String e:ele)// Here we convert into One List<String> into String type in forEeach loop 
		 {
			 System.out.print("  "+e);
		 }
		System.out.println("\n -------------------------------------------------------------   ");
		//How to add a new line after entering the last the line I want ot create the new line for the next dataTable How to do this  
	}
	
	
	
}

	
}
