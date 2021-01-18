Feature: Greenkart Add Items to Cart

  Background:
    Given Initialize browser
    When User navigate to Greenkart Homepage
    Then Verify user landed in Homepage

# Testcase 1
  @Testcase1
  Scenario: Add item to cart and verify if product is added to cart page
    Given User is in GreenKart Landing page
    When User clicks on ADDTOCART button
    And User clicks on Cart icon
    Then Verify item is added to cart
    And Browser is closed

# Testcase 2
  @Testcase2
  Scenario: Refresh the page and verify if items are still present in the cart
    Given User is in GreenKart Landing page
    When User clicks on ADDTOCART button
    And User clicks on Cart icon
    And User refresh the browser
    Then Verify items are still present in cart
    And Browser is closed

#Testcase 3
  @Testcase3
  Scenario: Increase the count of item and verify it it is showing up in cart
    Given User is in GreenKart Landing page
    When User searched for  "Cucumber" vegetable
    And User clicks on plus button for 4 times
    And User clicks on ADDTOCART button
    And User clicks on Cart icon
    Then Verify items are still present in cart
    And Verify correct numbers of items are in cart
    And Browser is closed

#Testcase 4
  @Testcase4
  Scenario: Verify text ADDED pops up when you add item to cart
    Given User is in GreenKart Landing page
    When User clicks on ADDTOCART button
    Then Verify ADDED text is popped up
    And Browser is closed


#Testcase 5
  @Testcase5
  Scenario: Verify sum of products matches with amount displayed in cart
    Given User is in GreenKart Landing page
    When User searched for  "Cauliflower" vegetable
    And User clicks on plus button for 4 times
    And User clicks on ADDTOCART button
    And User clicks on Cart icon
    Then Verify sum of produts matches with amount displayed in cart
    And Browser is closed

#Testcase 6
  @Testcase6
  Scenario: Verify the prices shown up for products in page
    Given User is in GreenKart Landing page
    When User searched for  "Cauliflower" vegetable
    And User clicks on ADDTOCART button
    And User searched for  "Tomato" vegetable
    And User clicks on ADDTOCART button
    And User searched for  "Beans" vegetable
    And User clicks on ADDTOCART button
    And User clicks on Cart icon
    Then Verify prices shown up for products
    And Browser is closed


#Testcase 7
  @Testcase7
  Scenario: Verify if clear functionality working as expected in cart page
    Given User is in GreenKart Landing page
    When User searched for  "Cauliflower" vegetable
    And User clicks on ADDTOCART button
    And User clicks on Cart icon
    And User clicks on remove item icon
    Then Verify cart is empty
    And Browser is closed
