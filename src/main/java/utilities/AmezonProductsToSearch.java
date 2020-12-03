package utilities;

import java.util.HashMap;
import java.util.Map;
//  will use this class values in StepDefinition class 
public class AmezonProductsToSearch {
	  Map<String,Integer> prodCheck=null;


	private int price=0; // this field for get the price of the product 
	
	private String prod_Name=null; // this value I will get the from feature file 
 
	
 /**
 * @return the prod_Name
 */
public String getProd_Name() {
	return prod_Name;
}


/**
 * @return the price
 */
public int getPrice() {
	return price;
}


public AmezonProductsToSearch()// What  is the use of this  constructor 
{
	  this.prodCheck=new HashMap<String,Integer>();
}

/**
 * @param prod_Name the prod_Name to set
 */
public void setProd_Name(String prod_Name) { 
			// first I will set the name of the product when ever I create object of this class
	
	this.prod_Name = prod_Name;
}


/**
 * @param price the price to set
 */
public void setPrice(int price) {
	this.price = price;
}

  //How to test that feature file procuctName is available or not 

public boolean stausProduct(String productName)
{
boolean status=false;

status=this.prodCheck.containsKey(productName); // if that product Name is available then it returns true otherwise it returns  false
// how to get the product list contains that productName	or not how to do this 

return status;
}
public float getProdPrice(String productName)
{
	// can I use this method for class level variable will it work I will check later on  
float price=0;
price=prodCheck.get(productName);// if the product is available I will get the vale of the product from the list 
				// otherwise I will get the null or return the 0 value I will return
return price;
}
 
  public void productList()
  { // this class will execute only once
	  //Like in Amezon site different products list are there instead of go and search that product is available or not 
	  Map<String,Integer> prodList=new HashMap<String,Integer>();
	  prodList.put("Apple Mac Book",70000);
	  prodList.put("Apple IPhone", 30000);
	  prodList.put("Apple NotPad Tablet", 50000);
	  prodList.put("honor4S", 8000);
	  prodList.put("honor4A", 9000);
	  prodList.put("honor4N", 10000);
	  prodList.put("honor4B", 7000);
	  prodList.put("honor4C",  7500);
	  prodList.put("honor9Lite",7000);
	  prodList.put("Oppo",9000);
	  
	  prodCheck.putAll(prodList); // this is for add these are all product things 
  }

}
