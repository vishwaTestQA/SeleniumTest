Feature: product verify

Scenario Outline: validate search
    Given when enter product2 as <products> in search
    When enter the search option
    Then choose the product and click
    
  Examples:
    |products|
    |shoes|
   
    