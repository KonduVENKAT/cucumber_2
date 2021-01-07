package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingAmount {// this class is not working as per my expectaion 

	

@Given("when user select the produt1 {string}")
public void when_user_select_the_produt(String prod_Name) {
 System.out.println("Step-1 - Product Name : "+prod_Name);
}

@When("user selects the product in the list1")
public void user_selects_the_product_in_the_list() {
	System.out.println("Step-2 - User select the producut under the list ");
}

@Given("user is on Billing Page to Total amount Page1")
public void user_is_on_billing_page_to_total_amount_page() {
System.out.println("Step-3 - User is on Billing Page "); 
}

@When("user  enters the billing amount1 {int}")
public void user_enters_the_billing_amount(Integer productAmount) {
	System.out.println("Step-4 - Product Amount : "+productAmount); 
	
}

@When("user enters tax amount1 {int}")
public void user_enters_tax_amount(Integer taxIntAmount) {
	System.out.println("Step-5 -  user check the taxAmount :: "+taxIntAmount); 
}

@When("user click on Caluclate button1")
public void user_click_on_caluclate_button() {
	System.out.println("Step-6 - user click the calucalate button "); 
}

@Then("it gives the final amount1 {int}")
public void it_gives_the_final_amount(Integer finalIntAmount) {
	System.out.println("Step-7 - user get the final Amount of the selected Amount :: "+finalIntAmount); 
}

@When("user enters tax amount1 {double}")
public void user_enters_tax_amount(Double taxAmount) {
  
	System.out.println("Step-8 - User get the tax Amount of the selected porduct :: "+taxAmount); 
	
}

@Then("it gives the final amount1 {double}")
public void it_gives_the_final_amount(Double finalAmount) {
	System.out.println("Step-9 - User get the final product Amount of the selected Product :: "+finalAmount); 
	
}


}
