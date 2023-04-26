Feature: Log in with different user
  # Agile : As a user i should be able to lig in with different user


  Scenario: Log in as a teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Teacher"

  Scenario: Log in as a Jack Bauer with parameters
    Given The user is on the login page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The user should be able to login
    Then The welcome message contains "Jack Bauer"

  Scenario: User navigates to Student Menu
    Given The user is on the login page
    When The user logs in using "student@study.net" and "Test1234"
    Then The welcome message contains "Teacher"
    And The user navigates to "Student" menu
