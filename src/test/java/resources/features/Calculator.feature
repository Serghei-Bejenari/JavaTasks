Feature: Calculator

  @Run
    @Scenario1
  Scenario Outline: Calculate two numbers
    Given  User enters enters numbers
    When performed '<operator>' on the <firstNumber> and <secondNumber> number
    Then Verifies that result equals <result>

    Examples:
      | firstNumber | secondNumber | operator | result |
      | 15          | 10           | +        | 25     |
      | 20          | 10           | -        | 10     |
      | 5           | 5            | *        | 25     |
      | 25          | 5            | /        | 5      |

  @Run
  @Scenario2
  Scenario: Adding several numbers with calculator
    Given Entered three numbers
      | 2 |
      | 5 |
      | 7 |
    When Calculator give sum of given numbers
    Then Verifies that actualResult equals 14