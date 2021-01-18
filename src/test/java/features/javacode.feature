Feature: Java Interview Coding Test
  @InterviewQuestionTest
  Scenario Outline: Complete java code for Interview
    Given User is asked by <Interview Question>
    When User writes the code for <Interview Question>
    Then <Interview Question> result will be displayed

    Examples:
    |Interview Question|
    |Reverse String    |
    |Reverse Digits    |
