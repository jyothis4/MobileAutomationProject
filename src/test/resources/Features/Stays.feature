Feature: Finding Stays

  Scenario: Verify user can see the stays listing
    Given user opens the application
    Then verify user is on home screen
    When user clicks on the stays tab
    Then user is on the stays page
    When user enters "destination" location field
    And user selects the date as "18 Sep 2024"
    When user selects travelers and room
    Then verify stays listing page is displayed