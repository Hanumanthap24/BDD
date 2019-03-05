Feature: Login Functionality
Scenario: Testing failure login
#Scenario Outline: Testing failure login

#Given User is in login page
#When user enters Wrong user "<name>"
#And user enters Wrong "<password>"
#Then login failed mesage diasplayed
#
#Examples:
#	|name   |password|
#	|jkajkak|anajsna|
#	|nbbaa  |nsajnman|

Given User is in login page
When user enters Wrong user name and password
	|name   |password|
	|jkajkak|anajsna|
	|nbbaa  |nsajnman|

Then login failed mesage diasplayed
	|mesage|diasplayed|
	|mesage2|diasplayed2|
	|mesage3|diasplayed3|
	|mesage4|diasplayed4|
	|mesage5|diasplayed5|
