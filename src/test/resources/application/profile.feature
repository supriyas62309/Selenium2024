Feature: Profile operations
Scenario: Creation of profile
Given user should present on home page
When user clicks on add profile button
And user enters the data
Then profile should get created

Scenario: updation of profile
When user clicks on edit profile button
And user updates the data
Then profile should get modified

Scenario: deletion of profile
When user clicks on delete profile button
Then profile should get deleted