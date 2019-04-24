Feature: LoginTest

  @QA
  Scenario: Verify Login is successful
    Given user launched the application
    When user enters credentials
    And clicks on signin button
    Then user should be able to login

  Scenario: Verify title of page
   Given user verifies "homepage"