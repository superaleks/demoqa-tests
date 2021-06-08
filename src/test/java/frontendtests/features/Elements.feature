Feature: Elements interaction

#  Scenario: Text box
#    Given that the user wants to fill the form
#    When he navigates to the form and enters the requested data
#    Then he can submit succesfully

  Scenario: Check Box
    Given that the user needs to check a checkbox
    When he navigates to the checkbox and selects it
    Then he can observe the change

#  Scenario: Radio Buttons
#    Given that the user needs to use a radiobutton
#    When he navigates to the radiobutton section of the site
#    Then he can select the one he likes
#
#  Scenario Outline: Web Tables
#    Given that the user has navigated to the web table section
#    When he wants to see the "<salary>" of a "<person>"
#    Then he can read it properly
#    Examples:
#      | salary | person      |
#      | 100000 | Cierra Vega |
#
#  Scenario: Buttons
#    Given that the user wants to interact with a button
#    When he navigates to the button section of the site
#    Then he can interact with all of the buttons
#
# Scenario: Links
#   Given that the user wants to check multiple links
#   When he navigates to the link section of the site
#   Then he can click on all the links and check if they work properly
#
#  Scenario: Broken links - images
#    Given that the users wants to validate an image
#    When he navigates to the image section
#    Then he can identify the broke ones
#
# Scenario: Upload and Download
#   Given that the user wants to upload and download a file
#   When he navigates to the relevant section
#   Then he can do so succesfully
#
# Scenario: Dynamic Properties
#   Given that the user wants to interact with dynamic properties
#   When he navigates to the dynamic properties section
#   Then he can do so succesfully