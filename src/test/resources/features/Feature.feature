@Landing_Page
Feature: Landing Page Verification

  Scenario: Verify elements on the landing page
    Given user navigates to the landing page
    Then user should see the Home icon
    And user should see the Products icon
    And user should see the Contact us icon
    And user should see the Signup / Login icon
    And user should see the Cart icon

  Scenario: User is able to signup successfully
    Given user clicks on Signup / Login Button
    Then user navigates to New User Signup! action
    And user enters Name in the textbox
    And user enters Email in the textbox
    Then user clicks on Signup Action
    And user selects Title
    And user enters Password
    And user enters First Name and Last Name
    And user enters Address
    And user selects Country
    And user enters State, City, and Zipcode
    And user enters Mobile Number
    Then user clicks on Create Account
    Then I verify success message for Account Creation