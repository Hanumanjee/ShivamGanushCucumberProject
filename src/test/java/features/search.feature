Feature: Search and place order for Vegetables

  Background:
    Given validate the browser
    When Browser is triggered
    Then check if browser is started
@SmokeTest
  Scenario: Search for items and validate results
    Given User is in GreenKart Landing page
    When User searched for  "Cucumber" vegetable
    Then "Cucumber" result is displayed
   # And close the browser

  @RegressionTest
  Scenario: Search for items and move to checkout page
    Given User is in GreenKart Landing page
    When User searched for  "Brinjal" vegetable
    And Added items to cart
    And User proceeds to Checkout page for purchase
    Then Verify selected "Brinjal"items are displayed in Checkout page
   # And close the browser

  @RegressionTest
  Scenario Outline: Search for items and validate results
    Given User is in GreenKart Landing page
    When User searched for  <VegetableName> vegetables
    Then <VegetableName> results is displayed
    And close the browser
    Examples:
      | VegetableName |
      | Cucumber      |
      | Tomato        |
      | Brinjal       |

@GitTest
  Scenario Validate successfully purchase message
    Given User is in GreenKart Landing page
    When User searched for  "Apple" vegetable
    And Added items to cart
    And User proceeds to Checkout page for purchase
    And User click on PlaceOrder button
    And User selected country "India" from dropdown list
    And User checked Agree to the Terms & Conditions
    And User click on Proceed button
    Then Validate the message