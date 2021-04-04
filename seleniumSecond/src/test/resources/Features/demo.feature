Feature: Demo

@one
Scenario: verify invalid Dashboard
Given enter application title to be "BIG j | Think unbeatable savings, think big, Think BIG W"
And navigate back to home

@one
Scenario: verify valid Dashboard
Given enter application title to be "BIG W | Think unbeatable savings, think big, Think BIG W"
And navigate back to home

@one
Scenario: verify invalid2 Dashboard
Given enter application title to be "BIG V | Think unbeatable savings, think big, Think BIG W"
And navigate back to home