Feature: Calculator As a user I want to use a calculator to add numbers So that I don't need to add myself

  Scenario: Add two numbers -2 & 3
    Given I have a calculator
    When I add -2 and 3
    Then the result should be 1

  Scenario: Add two numbers 10 & 15
    Given I have a calculator
    When I add 10 and 15
    Then the result should be 25

  Scenario Outline: Add multiple numbers
    Given I have a calculator
    When I add <first_value> and <second_value>
    Then the result should be <expected_value>
    Examples:
      | first_value     | second_value  | expected_value  |
      | 1               |  49           |    50           |
      | 3               |  77           |    80           |
      | 4               |  66           |    70           |
      | 0               |  90           |    90           |