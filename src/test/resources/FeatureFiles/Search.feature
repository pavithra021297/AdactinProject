@search
Feature: To Validate Hotel functionality

  @smoke
  Scenario Outline: To validate Hotel Booking functionality using valid credentials
    Given User is in Adactin login page
    And User enter "<Username>" and "<Password>" and click Login
    When User is in Search page, user enter details for Search hotel
    And User click Search button
    Then user book the hotel by filling details "<firstname>","<lastname>"and"<address>"
    And user pay the amount using "<cc_num>" and "<cvv>"
    And User click bookNow button and id number is generated

    Examples: 
      | Username   | Password   | firstname | lastname | address | cc_num           | cvv |
      | pavithra97 | pavithra97 | pavithra  | chandar  | chennai | 1234567887654321 | 123 |
      #| pavithra97 | pavithra97 | pavi      | c        | chennai | 1234598778954321 | 678 |
