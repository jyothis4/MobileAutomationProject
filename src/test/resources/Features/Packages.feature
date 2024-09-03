Feature: Packages Search

  Scenario: Verify user can search packages
    Given user opens application
    Then verify user is on home screen
    When user click on packages tab
    Then verify user is on packages search page
    When user enters "Chicago" into flying from
    And user enters "Florida" into flying to
    And select date from "September 18, 2024" to "September 19, 2024"
    When user gives traveler details with rooms
    And user gives preferred class
    And click on search button
    Then verify package listing page is displayed

  Scenario: Verify user can search packages with Flight + Car
    Given user opens application
    Then verify user is on home screen
    When user click on packages tab
    Then verify user is on packages search page
    And user clicks on Flight + Car
    When user enters "Chicago" into flying from
    And user enters "Florida" into flying to
    And select date from "September 18, 2024" to "September 19, 2024"
    And click on search button
    Then verify package listing page is displayed