Feature: Registration for bank account
Scenario: user information addition
Given user should be at registration page
When user enters following details
| Edrin | Smith | erin.smith@gmail.com | 9970062309 |
| Robert | Jackson | rob.j@gmail.com | 8484901111 |

Then user get registration confirmation