@regression @smoke @SKYW-25 @E2E
Feature: Drugs.com Search Functionality

  Scenario: Search for Advil
    Given the user is on the drugs.com website
    When the user click on "Side Effects" in the main menu
    And the user clicks on the search button
    And  Select "Advil"
    Then the user should see information about drug side effects on Advil only