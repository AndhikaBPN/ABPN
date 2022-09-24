Feature: Register user

  Scenario Outline: Register user
    Given User go to demo qa register page
    When User register input <username> and <email> and <password>
    And User click show password icon
    And User click register button
    Then valid validation

    Examples: 
      | username | email | password |
      | tydae		 | tydae@yahoo.co.id | tydaetrek889765 |
      | locyur  | locyur@strog.xyz | l_cyuro34121i |
      | nyedri | nyedri@tsuim.com | nydrei358889 |
