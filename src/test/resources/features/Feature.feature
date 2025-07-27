@Landing_Page
Feature: Landing Page Verification

  Scenario: Verify elements on the landing page
    #Given user navigates to the landing page
    Then user should see the Home icon
    And user should see the Products icon
    And user should see the Contact us icon
    And user should see the Signup/Login icon
    And user should see the Cart icon

