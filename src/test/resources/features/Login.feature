Feature: DevEx log in test

  Scenario: Log in as a teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  Scenario: Log in as a student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

    # create test scenario for developer

  Scenario: Log in as a developer
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login