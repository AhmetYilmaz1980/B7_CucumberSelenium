@NavigationMenu
Feature: NavigationMenu

  @developer
  Scenario: Navigation to developers menu
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to see welcome message
    When The user navigates to developers menu
    Then The user should be able to see Developer text

  Scenario: Navigation to All Posts menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to see welcome message
    When The user navigates to All Posts menu
    Then The user should be able to see Posts text

  Scenario: Navigation to My Account menu
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to My Account message
    When The user navigates to developers menu
    Then The user should be able to see Dashboard text



