Feature: To validate login funtionality

  Background: 
    Given User is in facebook login page

  #without header (list)
  Scenario: To validate  login using invalid credentials
    When User enter invalid username and password
      | greens | greeen@123 |
      | blue   | blue@123   |
      | red    | red@123    |
    And User click login button
    Then User must be in invalid credentials page
