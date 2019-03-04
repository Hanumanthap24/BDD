Feature: Free login
Scenario: CRM Login Test

Given User is on login page
When Titleis CRM
Then User enters username 
Then Usepassword

Scenario: Testing failure login

Given User is in login page
When user enters Wrong user name
And user enters Wrong password
Then login failed mesage diasplayed






