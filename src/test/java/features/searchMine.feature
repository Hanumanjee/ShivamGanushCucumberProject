Feature: Vegetable Items

  Scenario: Search vegetable Cucumber
    Given Initialize browser
    And Landing the GreenKart page
    When User enter "cucumber" in search box
    Then Validate Cucumber vegetable is displayed
    And Close the browser


  Scenario: Validate Item numbers increasing
    Given Initialize browser
    And Landing the GreenKart page
    When User enter "cucumber" in search box
    And Increase the item numbers by clicking plus button
    Then Validate item numbers
    And Close the browser