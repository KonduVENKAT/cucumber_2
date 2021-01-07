Feature: This featire file is for Scenario Outline with examples 

Scenario Outline: this is for Login scenario using DataDriven approach For negitive values 
# this is used for data driven appraoch this feature we will use check for more details for videos 
Given User in on Aapplication site 
When user click on Login Page 
Then user is displyed on login Screen 
When user Enters the userName "<UserName>" in userName feild
And user Enters the Password "<Password>" in password feild
And User clicks the Signin button
Then user get login faild information from the page  

	Examples: 
	|    UserName        |      Password      |
	| incorrect_userName | incorrect_password |
	| correct_userName   | incorrect_password |
	| incorrect_userNae  | correct_password   |
	| correct_userName   | correct_password   |
	
	