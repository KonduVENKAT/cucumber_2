Feature: Calucalte Billing Amount in E-Commerce Applications

Scenario Outline: Amezon Caluclation of the product amount

Given when user select the produt "Product"
When user selects the product in the list
Given user is on Billing Page to Total amount Page
When user  enters the billing amount "<Billing Amount>" 
When user enters tax amount "<Tax Amount>" 
And user click on Caluclate button 
Then it gives the final amount "<Final Amount>"
 
 Examples:
 | Billing Amount | Tax Amount | Final Amount |
 |    1000        |   280      |  1280        |
 |    1500        |  	420      |  1920        |
 |    1800        |   504      |  2304        |
 |    2000        |   560      |  2560        |
 |    1129        |   312.1    |  1441.1      |
 |    2600        |   728      |  3328        |