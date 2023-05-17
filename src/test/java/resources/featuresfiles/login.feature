@sanity @regression
Feature: Login Test
  User want to login into saucedemo website
  Scenario: User Should Login Successfully With Valid Credentials
    Given User is on homepage
    When User enter username "standard_user"
    And User enter password "secret_sauce"
    And User click on login button
    Then User should login successfully
    And Verify the text "Products"