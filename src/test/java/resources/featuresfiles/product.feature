@sanity @regression
Feature: Verify Test
  Scenario: verify That Six Products Are Displayed On Page
    Given User is on homepage
    When User enter username "standard_user"
    And User enter password "secret_sauce"
    And  User click on login button
    Then Six products should displayed on page