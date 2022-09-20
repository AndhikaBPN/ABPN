Feature: User nopcommerce login

	Scenario: User invalid login
		When User open nopcommerce login page
		And User input invalid email and password
		And User click login button
		Then User invalid nopcommerce credentials


	Scenario: User valid login
		And User input valid email and password
		And User click login button valid
		Then User valid nopcommerce credentials
