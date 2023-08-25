Feature: Login Function

#send data in code( same 4 steps)
# sending data for a particular step

Scenario: Valid Login
Given User is on Login page
When User enters credentials
|username|password|
|tomsmith|SuperSecretPassword!|
Then User should be navigated to Home Page

#send data from feature file
#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User should be navigated to Home Page

#send multiple data from feature file
#Scenario Outline: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then User should be navigated to Home Page

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|
#|testuser1|Welcome123|
#|testuser2|Welcome123|