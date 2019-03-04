Feature: Login Functionality
Scenario Outline: Testing failure login

Given User is in login page
When user enters Wrong user "<name>"
And user enters Wrong "<password>"
Then login failed mesage diasplayed

Examples:
	|name   |password|
	|jkajkak|anajsna|
	|nbbaa  |nsajnman|
