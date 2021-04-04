Feature: Search Products

@prod
 Scenario: validate search
    Given when enter product as "watch" in search
    When change the selection type as "Electronics"
    When enter the search option
    Then choose the productWatch and click

  Scenario: validate search
    Given when enter product as "lenovo slim 3 amd" in search
    When enter the search option
    Then choose the productLenovo and click

  Scenario: validate search
    Given when enter product as "mobile" in search
    When enter the search option
    Then choose the productSamsung and click
    

    
 
