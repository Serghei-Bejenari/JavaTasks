Feature: Calculator

  @Run
  Scenario: Multiply two numbers
    Given Multiply operation
    When Multiply first number to second number
      | firstNumber  | 5 |
      | secondNumber | 5 |
    Then I obtain as result number 25