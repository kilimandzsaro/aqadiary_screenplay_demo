@Admin
Feature: Admin's user actions on demo testfire homepage
  The feature suppose to test the login/logout functionality
  of the demo testfire page and some different user actions 
  such as create user, modify user's password and so on. This is
  a good example how should not depend on tests to each other. Therefore
  the password modification test will contain a user creation tests too.

  Scenario: Add a new user
    Given Admin user logged in to testfire page
    When Amin creates a new user
    And he logs out
    Then the new user can log in with the given credentials
    
  Scenario: Admin user logged in to testfire page
    Given Admin user logged in to testfire page
    And he creates a new user
    And the new user can log in with the given credentials
    When Admin changes the password of the new user
    And he logs out
    Then the new user can log in with the new credentials

  Scenario: Add account to existing user
    Given Admin user logged in to testfire page
    And he creates a new user
    When Admin chages the account type of the new user
    Then the new user has the new account type