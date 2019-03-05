Feature: Free login
Scenario Outline: CRM Login Test

Given User is on login page
When Titleis CRM
Then User enters "<username>"
Then enters the "<pasword>"

Examples:
|username|pasword|
|Dunny2|pass2|
|Dunny3|pass3|
|Dunny4|pass4|



