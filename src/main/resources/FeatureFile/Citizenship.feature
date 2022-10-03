Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  Scenario: Add Citizenship
    When User create Citizenship with "TestAkifCitizen3" name and "TAC13" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "TestAkifCitizen3" citizenship to "UpdateAkifCitizenship"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "UpdateAkifCitizenship" citizenship
    Then Success message should be displayed