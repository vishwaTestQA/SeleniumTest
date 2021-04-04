Feature: Registration

@Reg
Scenario: Invalid Registration

Given I am on the new user registration page
When i enter email and password

| vvvvv@gmail.com | dfggghhh |
| vvvvv@gmail23.com | dfggghhhrt |


Then I enter invalid data on the page

| First Name   |  Last Name    | Email Address         | Mobile Number  |
|     Tom      |    Kenny      |  someone@someone2.com | 801345675345   |
|     Tom2     |   Kenny2      |  someone@someone.com  | 80134567534534 |


And the user registration should be unsuccessful

