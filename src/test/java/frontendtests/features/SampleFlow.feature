Feature: Sample flow

  Scenario Outline: Verify if the call us now number is displayed properly
    Given the user has navigated to the homepage
    Then he can confirm that the "<number>" in the header is present
    Examples:
      | number             |
      | 0123-456-789       |



