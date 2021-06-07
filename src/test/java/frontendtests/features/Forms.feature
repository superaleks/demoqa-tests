Feature: Forms interaction

  Scenario: Student registration form
    Given the user needs to fill a registration form
    When he navigates to the student form page
    Then he can fill and submit the form with no errors
