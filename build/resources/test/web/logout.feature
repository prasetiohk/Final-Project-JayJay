@web
Feature: Logout

  @valid_logout
  Scenario: Logout from website
    Given user is on home page
    When user click logout button
    Then user on at first page