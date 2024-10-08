Feature: login to functionality
Scenario: login with correct credentials
Given user is at login screen
When enter username
And enter password
And click on login
Then user should see the home page