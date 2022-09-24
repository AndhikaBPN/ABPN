Feature: shop demo qa login page

  Scenario Outline: Login user
   	Given User go to demo qa login page
    When User login input <username> and <password>
    And User click login button
    Then invalid validation

    Examples: 
      | username  | password 				|
      | urye 			| uryeadsk12343 	|
      | klone 		| klone123321diak |
      | okiye 		| okiye12332 			|
      | chore 		| corras12209 		|
      | kluht 		| skluht12212 		|
      
