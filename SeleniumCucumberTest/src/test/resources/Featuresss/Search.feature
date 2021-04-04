Feature: Search Products

  Scenario: validate search
    Given launch browser and navigate to bigw url
    When when enter products in search
    And enter the search option
    And choose the product and click
    Then close the browser
#
   #Background  
    #Scenario: validate search
    #
    #When when enter products in search
    #And enter the search option
    #And choose the product and click
    #Then close the browser