Feature: JAVA CERTIFICATION

    Scenario: Valid Certification
        Given that the user Vincent is given a task to clear JAVA certification exam
        When Vincent got 69 marks in exam
        Then Vincent is known as JAVA certified

  Scenario Outline: Certification
    Given that the user <name> is given a task to clear <language> certification exam
    When <name> got <score> marks in exam
    Then <name> is known as <language> certified
    Examples:
      | name     | score | language  |
      | John     |  49   | PYTHON    |
      | Smith    |  79   |  JAVA     |
      | Luke     |  66   |  PHP      |
      | Stephen  |  90   |  C#       |


