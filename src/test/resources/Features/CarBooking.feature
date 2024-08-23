Feature: Car Booking

  Scenario: Verify user can see the car listing
    Given user opens the application
    Then verify user is on home screen
    When user clicks on the car tab
    Then user is on the car booking page
    When user enters "Alberta" into the Pick-up location field
    And user enters "Brooklyn" into the Drop-off location field
    And user selects the date as "12 Aug 2024"
    When user selects time from dropDown
    Then verify listing page is displayed