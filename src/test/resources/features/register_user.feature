Feature: Registers a user
  As a user
  I want to register in the system
  To access the system with my credentials

  # Happy path scenarios

  Scenario: registers a user
    Given the email "foo@bar.com" is selected
    And the password "password" is selected
    When I register the user
    Then the user is registered
