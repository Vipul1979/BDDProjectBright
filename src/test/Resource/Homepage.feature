Feature: Homepage functionality

  @regression
  Scenario: Search product
    Given user is on the homepage of argos website
    When user wants to search for product
    Then user should see all the relevant searched products


  @smoke
  Scenario: Clicking on account button
    Given user is on the homepage of argos website
    When user clicks on the account button
    Then user should see the detail of account.

    @sanity
    Scenario Outline: search multiple product
      Given user is on the homepage of argos website
      When user try to find multiple "<product>"
      Then user should see all the relevant searched products

      Examples:
      |product|
      |nike   |
      |puma   |
