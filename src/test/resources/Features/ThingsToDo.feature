Feature: Things to do

  Scenario: verify the details in things to do
    Given user opens application
    Then verify user is on home screen
    When user click on search icon
    Then verify user is on search page
    When user clicks on things to do
    Then user gives destination
    When user gives the dates
    And user clicks on the card
    Then verify user entered details with details on the card