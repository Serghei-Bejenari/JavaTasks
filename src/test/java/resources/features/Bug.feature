Feature: Calculator

  @Bug
  Scenario: Divide by zero
    Given Calculator is running
    When Trying divide 8 to 0
    Then Receive error message as result