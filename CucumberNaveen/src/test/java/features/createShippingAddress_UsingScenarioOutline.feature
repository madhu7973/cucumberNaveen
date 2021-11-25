Feature: create shipping address 

Scenario Outline: create new shipping address 

	Given user is on login page 
	When user enters login credentials "<username>" and  "<password>" 
	And clicks on login button 
	Then user is redirected to account page 
	When user clicks on add shiiping address link 
	Then user enters the shipping address "<fn>", "<ln>", "<pn>", "<address>", "<city>" and "<zip>" 
	Then user clicks on save button in shipping page 
	Then user clicks on saveaddress button in confirmation page and navigated to shipping address page 
	And close the browser 
	
	Examples: 
	
		| username | password | fn | ln | pn | address | city | zip |
		|madhu7973@gmail.com|Madhu123! | Raj | Kumar | 2222222222 | Snagar | Bengaluru | 560071 |
		#|madhu7973@gmail.com|Madhu123! | Madhu | sudan | 3333333333 | JP Nagar | bengaluru | 560078 |