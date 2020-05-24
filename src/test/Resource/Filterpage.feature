Feature: Filter product selection

  Background:
    Given user is on the homepage of argos website
    When user wants to search for product
    Then user should see all the relevant searched products
    Given user is on the result page of the argos website
    When user clicks on the Running filter
    Then user should see all the products associaed with running filter

    Scenario: click on one of the product
      Given user is on the result page of the running filter
      When user click on one of the product
      Then user should able to see that product to add in basket
