Feature: Login Functionality

  Scenario: Valid Login with Correct Credentials
    Given the user is on the ylogin page
    When the user enters valid yusername and password
    And clicks on the yLogin button
    Then the user should be redirected to the ydashboard