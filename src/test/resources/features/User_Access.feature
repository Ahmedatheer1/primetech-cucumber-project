Feature: User Access Management
  As a user i want to ligin to my crater app.

  Scenario: User should be able to login with valid credentials
    Given : user is navigate to crater login page
    When : user enters valid user name and password
    And user click on login button
    Then user should be logged in successfully


  Scenario: User should be not able to login with invalid credentials
    Given : user is navigate to crater login page
    When : user enters invalid email

    And user click on login button
    Then user should be logged in successfully