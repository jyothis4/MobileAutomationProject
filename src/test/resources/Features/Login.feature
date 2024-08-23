Feature: Validate login functionality

  Scenario: verify user login
    Given user opens the application
    When user click on log in
    And user click on continue with mail
    Then verify user is on login page
    And user enters email "user.email" and password "user.password"
    When user click on login button
    Then verify user is on home page