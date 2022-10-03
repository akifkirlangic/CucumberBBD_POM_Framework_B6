Feature: Fee Functionality


  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  Scenario Outline: Add Fees
    And User create Fees "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name    | code    | intCode   | priority |
      | MakFee1 | 1212101 | paypal    | 8437     |
      | MakFee2 | 6645133 | applePay  | 6448     |
      | MakFee3 | 1976104 | googlePay | 1860     |


  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName |
      | MakFee1         | UpMakFee1  |
      | MakFee2         | UpMakFee2  |
      | MakFee3         | UpMakFee3  |


  Scenario Outline:  Delete fee
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName   |
      | UpMakFee1 |
      | UpMakFee2 |
      | UpMakFee3 |
