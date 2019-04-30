Feature: AssignmentTest

  @QA
  

  Scenario: Verify user is able to add a product to the cart
   Given user is on home page of application
    When user navigate to women's section
    And choose a top and add it to the cart
    And make the payment
    Then user should be able to complete the order