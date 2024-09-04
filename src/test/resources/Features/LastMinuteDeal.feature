Feature: Finding Last Minute Weekend Deals

  Scenario: Verify offer price of weekend deals
    Given user opens the application
    Then verify user is on home screen
    When user scrolls to go Last-minute weekend deals if needed
    And user slides to the deals with offer if needed
    Then verify the offer tag with offer price and actual price
    And user selects the card
    When user selects select a room
    And user is able check more details
    Then verify the price in the price details with offer price