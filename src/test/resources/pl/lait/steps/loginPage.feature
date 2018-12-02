@tag
Feature: Flight reservation
  I want to login and reserve some flight

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill login form with login "skopau" and pass "skopau123456789"
    Then I should see the flight reservation form

  Scenario: simple reservation process
    Given I open main page
    When I fill login form with login "skopau" and pass "skopau123456789"
    And I click on button one way from type flight
    And I click on select button passenger and choose "2"
    And I click on  select button departing from and choose "London"
    And I click on select button  on" and choose December and "01"
    And I click on select button on arriving on and choose "Acapulco"
    And I click on select button on returning and choose December and "3"
    And I click button on economy class from service class
    And I click on select button Airline and choose "Blue Skies Airlines"
    And I click on "continue" button
    When I should see the select flight page
