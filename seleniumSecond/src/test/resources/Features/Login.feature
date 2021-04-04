Feature: Login feature

@log
Scenario Outline: login with excel
Given user on the login page
When user enter username and password with excel data at "C:/Users/vishwa/eclipse-workspace/seleniumSecond/src/test/resources/Excel/Login.xlsx" sheet at <sheetName> and rownum <rowNum>
And Click submit button
Then verify the title

Examples:
| sheetName | rowNum |
| LoginSheet | 1 |
| LoginSheet | 4 |













