Feature: product verify

Scenario Outline: validate search
    Given when enter product2 as <products> in search
    When enter the search option
    Then choose the product and click
    And navigate back to home
    
  Examples:
    |products|
    |shoes|
    |jeans|
    
    
    Scenario Outline: verify title of product
     Given when enter product2 as <products> in search
     When enter the search option
     Then choose the product and click
     Then verify product with title
     And navigate back to home
     
      Examples:
    |products|
    |shoes|
    
   
   
    