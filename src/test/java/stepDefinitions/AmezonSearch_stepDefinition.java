package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.AmezonProductsToSearch;
//This class implements the AmezonSearch.feature file steps in the form of glue code implementation
public class AmezonSearch_stepDefinition { // this is for I'm using java code for implementing the AmezonSearch feature file 

	String productName=null;
AmezonProductsToSearch aptSearch=new AmezonProductsToSearch();	 // I wll get the values from that class 
private boolean prod_Availability=false;// default value I'm setting // this value is available only for this class  
	
@Given("User enter the product_Name {string} price {int}")
public void user_enter_the_product_name_price(String productName, Integer price) {
    System.out.println("Step_1 -- in searh feild I am passing the above values like ProductName "+productName+" and it's price Rs\\-"+price);

    this.productName=productName;
}

@When("user in search feild")
public void user_in_search_feild() {
	  System.out.println("Step_2 -- Here I'm validating the In Amezon site searfeild is available or not ");
Assert.assertTrue(true);

if(this.prod_Availability=aptSearch.stausProduct(this.productName))
{//aptSearch.getProdPrice(this.productName);
System.out.println("Actual price of that product ::\'"+this.productName+"\'::   is "+aptSearch.getProdPrice(this.productName));
}

}

@Then("user click on serach feild button")
public void user_click_on_serach_feild_button() {
	  System.out.println("Step_3 -- After entering the details of the product name I have to click on Search Button");

}

@Then("find the {string}  item is available in List or Not under Amezon product_List")
public void find_the_item_is_available_in_list_or_not_under_amezon_product_list(String productName) {
	  System.out.println("Step_5 -- Here I have to validate that given product name in serach feild is ::\'"+productName+"\':: available in Amezon productList or not ");
// I have to implement some java code here for feature purpose like achieving the data validation part 

	 if(aptSearch.stausProduct(this.productName)) 
	 { 
		 System.out.println("Product is avaulable");
		 System.out.println("Actual price of that product ::\'"+this.productName+"\'::   is "+aptSearch.getProdPrice(this.productName));

	 }
}

@Then("that item is available under the Amezon product_List click on that item")
public void that_item_is_available_under_the_amezon_product_list_click_on_that_item() {
	  System.out.println("Step_6 -- If that product is available I have to clik on submit button ");
// For this I have to create one class variable for boolean type If that product is available return true otherwise it's return false 
if(prod_Availability==true)
{
	System.out.println("Click on the proceed to payment for that product ");
}
else
{
System.out.println("Product in not available in Amezon store App");	
}

}


	
}
