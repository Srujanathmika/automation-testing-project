Feature: Navigation Feature

  Scenario: Open the site and click on Signup/Login
    Given I open the browser
    When I navigate to "https://automationexercise.com"
    And I click on "Signup / Login" link
    Then I should see the page title contains "Login"