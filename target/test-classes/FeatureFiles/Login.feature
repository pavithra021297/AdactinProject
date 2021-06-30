@login
Feature: To validate Login functionality.

  Background: 
    Given User is in Adactin login page

  @sanity
  Scenario Outline: To validate Login using invalid Credentials
    When User enter invalid "<Username>" and "<Password>"
    And User enter Login button
    Then User must validate the result based on "<combination>"

    Examples: 
      | Username | Password | combination |
      | sql      | sql@123  | negative    |
      | java     | java@123 | negative    |

  @regression
  Scenario: To validate login without entering requried credentials
    When User enter Login button
    Then User must be in invalid Credential page

  @smoke @regression
  Scenario: To validate Login using Valid Credentials
    When User enter valid Username and Password
    And User enter Login button
    Then User must displayed with Successful Login

  @sanity
  Scenario: To validate login using valid credentials
    When User enter valid username and password
      | username | pavithra97 |
      | password | pavithra97 |
    And User enter Login button
    Then User must displayed with Successful Login
