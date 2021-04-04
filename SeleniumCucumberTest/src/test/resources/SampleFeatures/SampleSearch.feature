Feature: Search Products

  Background: 
    Given launch browser and navigate to bigw url

  Scenario: validate search
    When enter products in search
    And enter the search option
    And choose the product and click
    Then close the browser

  Scenario: validate second search
    When when enter second products in search
    And enter the search option
    And choose the product and click
    Then close the browser
