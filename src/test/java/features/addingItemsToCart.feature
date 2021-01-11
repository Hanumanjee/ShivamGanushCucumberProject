Feature: Select Item Numbers
Scenario: Validate Item numbers increasing
  Given Initialize browser
  And Landing the GreenKart page
  When User enter "cucumber" in search box
  And Increase the item numbers by clicking plus button
  Then Validate item numbers
  And Close the browser



  Scenario: Validate Item numbers increasing
    Given Initialize browser
    And Landing the GreenKart page
    When User enter "cucumber" in search box
    And Increase the item numbers by clicking plus button
    Then User click the Add Item button
    And Close the browser