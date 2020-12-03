Feature: Amezon Search
Scenario: search the product with product Name

Given User enter the product_Name "Apple Mac book loptop" price 70000
#This step when we have to use this When Step I have to know about this 
#Below snippit I have to validate I am in search feild or not if not scenario is faild I will check whichh is execute first and last 
When user in search feild
#After do some things under the above  When step What I have to do in next step
Then user click on serach feild button 
#Any passwords related things 
And find the "Apple Mac Book"  item is available in List or Not under Amezon product_List
Then that item is available under the Amezon product_List click on that item
 
#For clicking the button
#How to do this Button Step in feature file 
# Button click on Item Add to cart button 
# Button step feature is not abailable
