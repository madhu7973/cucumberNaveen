#Without Examples keyword
Feature: walmart login 
#
#Scenario: valid login
#Given user is on login page
#When user enters login credentials "madhu7973@gmail.com" and  "Madhu123!"
#And clicks on login button
#Then user is redirected to repository page
#And close the browser


#With Examples keyword
Scenario Outline: valid login 
	Given user is on login page 
	When user enters login credentials "<username>" and  "<password>" 
	And clicks on login button 
	Then user is redirected to account page 
	And close the browser 
	
	Examples: 
		|username|password|
		#	|tom|cat|
		#	|apache|1234|
		|madhu7973@gmail.com|Madhu123!|