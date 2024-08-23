Feature: Change Region

  Scenario: Verify user can change region
    Given user opens application
    Then verify user is on home screen
    When user clicks on account
    Then verify user is on profile page
    When user clicks on settings
    And user clicks on change region
    When user clicks on account
    Then verify user is on profile page
    When user clicks on settings
    Then verify user is having the destination selected