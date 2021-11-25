Feature: Contatct us Using DataTable

Scenario: User fills the contatc us form and submits 

	Given user is in contact us page 
	When clicks on registery link 
	And clicks on email link 
	Then form is open and user enters the below data 
		| abc | def | abc@def.com | 1111111111 | Test contactUs - 1 |
	And clicks on submit button 
	And close the browser