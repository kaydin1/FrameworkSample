Feature: Login feature

  Background:
    Given user is navigated to Gmail application


  @smoke
  Scenario Outline: Negative login test
    When user enters "<email>"
    And clicks next to then enter invalid "<password>"
    Then user will be met with an "<error>"
    Examples:
     | email                | password  | error                                                         |
     |sampleEmail@gmail.com |password1  |Wrong password. Try again or click Forgot password to reset it.|
