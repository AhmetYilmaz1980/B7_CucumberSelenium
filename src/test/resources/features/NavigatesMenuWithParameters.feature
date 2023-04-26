
Feature: Navigate to Menu with Parameters

  Background:
    Given The user is on the login page
  Scenario: User navigates to developers Menu
    #Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"

  Scenario: User navigates to Student Menu
    #Given The user is on the login page
    When The user logs in using "student@study.net" and "Test1234"
    Then The welcome message contains "Student"
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"


  Scenario: User navigates to Developer Menu
   #Given The user is on the login page
    When The user logs in using "developer@developer.net" and "Test1234"
    Then The welcome message contains "Developer"
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard"



