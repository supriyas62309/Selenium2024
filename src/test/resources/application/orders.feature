Feature: order information
Background:
Given user should be logggend into app
When user clicks on order link
Then user redirects to the order page

Scenario: Fetching currently placed order
When useer clicks on currently placed order button
Then user should see current order information

Scenario: Fetching past order information
When user clicks on past order button
Then user should see past order information

Scenario: Fetching cancelled order information 
When user clicks on cancelled order button
Then user should see cancelled order information