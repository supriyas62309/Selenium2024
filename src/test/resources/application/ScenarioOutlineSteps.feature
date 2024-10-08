Feature: Signup functionality
Scenario Outline: Signup to application with different data
Given user is at signup page
When user enters name as "<name>" in the form 
And user enterd the age <age>
And user confirms the gender as "<gender>"
Then user will get created

Examples:
|name|age|gender|
|Eder|23|male|
|Daneil|24|Male|
|Diana|25|Female|