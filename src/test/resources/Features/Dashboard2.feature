Feature: Login Functionality

  Scenario: Valid Login with Correct Credentials
    Given the user is on the dlogin page
    When the user enters valid dusername and password
    And clicks on the dLogin button
    Then the user should be navigated to the dashboard
