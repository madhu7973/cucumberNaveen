Feature: Contatct us UsingHashMaps 

Scenario: User fills the contatc us form and submits 

	Given user is in contact us page
	When clicks on registery link map
	And clicks on email link map
	Then form is open and user enters the below data map
	   #|First Name | Last Name| e-mail | Phone Number | Message |#
		| abc1 | def1 | abc@def1.com | 1111111112 | Test contactUs - 2 |
		| abc2 | def2 | abc@def2.com | 1111111113 | Test contactUs - 3 |
		| abc3 | def3 | abc@def3.com | 1111111114 | Test contactUs - 4 |
	And clicks on submit button map
#	And close the browser map