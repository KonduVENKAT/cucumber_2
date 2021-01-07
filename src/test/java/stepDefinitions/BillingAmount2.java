package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingAmount2 {
	private float productValue=0;
	private float taxAmount=0;
	private float finalAmountwithTax=0;
	

@Given("when user select the produt {string}")
public void when_user_select_the_produt(String productName) {
  
System.out.println("Step - 1 - User slects the Product :: "+productName);
}

@When("user selects the product in the list")
public void user_selects_the_product_in_the_list() {

System.out.println("Step - 2 - User select that product form the list or not :: "); // here I have to implement one more class for the product is availablee or not 
}

@Given("user is on Billing Page to Total amount Page")
public void user_is_on_billing_page_to_total_amount_page() {

System.out.println("Step - 3 - User is on Billing page for Paying the Product final Bill ");

}

@When("user  enters the billing amount {string}")
public void user_enters_the_billing_amount(String productAmount) {

System.out.println("Step - 4 - User get the Product Amount from the feature file in String format  ::  "+productAmount);
// here I am converting that string amount into the float amount 
//this.productValue=(double)productAmount;// can not cast to String to doubule 

this.productValue=Float.parseFloat(productAmount);//1000.0
System.out.println("product Amount = "+this.productValue);//1000.0
System.out.println("Tax Amount "+productValue*28/100);// how to get this float valu 
float tax=this.productValue*28/100;
System.out.println("Taax= "+tax);

}

@When("user enters tax amount {string}")
public void user_enters_tax_amount(String taxAmount) {

System.out.println("Step - 5 - User get's the Tax Amount from the feature file in String format :: "+taxAmount);
this.taxAmount=Float.parseFloat(taxAmount);
System.out.println("Tax Amount = "+this.taxAmount);
}



@When("user click on Caluclate button")
public void user_click_on_caluclate_button() {

System.out.println("Step - 6 - User click on caluclate button for getting the final product value ");
}

@Then("it gives the final amount {string}")
public void it_gives_the_final_amount(String finalAmount) {

System.out.println("Step - 7 - User get the final Amount of the product from the feature file :: "+finalAmount);
float finalAmountFeature=Float.parseFloat(finalAmount);
this.finalAmountwithTax=this.productValue+this.taxAmount;
//this.finalAmountwithTax=
System.out.println("Final float value of the product = "+this.finalAmountwithTax);
System.out.println("from feature file finalAmount = "+finalAmount);
// Here I want to validate the feature file amount and this class amount is correct or not 
if(finalAmountwithTax==Float.parseFloat(finalAmount))
{
Assert.assertTrue(false);	
}

}


}
