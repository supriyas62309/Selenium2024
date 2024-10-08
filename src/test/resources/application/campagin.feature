Feature: Campagin functionality
@Sanity
Scenario: campagin creation
Given user should be login page
When user click on campagin button
And user provide the name in campagin
Then campagin created


@functional
Scenario: Schedule campagin
Given user should be loggined in
When user clicks on campagin
And enter the details to schedule
Then campagin get schedule

@Regression
Scenario: Validate status of campagin
Given user should be logged in
When user should creat draft status
Then user should see all drafted campagin