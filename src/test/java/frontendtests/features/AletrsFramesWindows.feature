Feature: Alerts, frames and windows
  Scenario: Browser windows
    Given the user wants to learn how to manage browser windows
    When he navigates to the relevant page
    Then he can perform all of the interactions with no issues

  Scenario:  Alerts
    Given that the user wants to learn how to manage alert windows
    When he navigates to alert page
    Then he can handle all of the alerts he sees

  Scenario: Frames
    Given that the user wants to learn how to manage frames
    When he navigates to the frame page
    Then he can interact with both of the frames

  Scenario: Nested frames
    Given that the user wants to learn how to manage nested frames
    When he navigates to the nested frames page
    Then he can interact with all of the nested frames

  Scenario: Modal dialogs
    Given that the user wants to learn how to manage modal dialogs
    When he navigates to modal dialogs page
    Then he can interact with all of the modal dialogs
