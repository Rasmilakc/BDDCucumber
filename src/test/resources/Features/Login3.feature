Feature: Login Functionality

  Scenario: Valid Login with Correct Credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks on the Login button
    Then the user should be redirected to the dashboard

  Scenario: Login with Incorrect Username
    Given the user is on the login page
    When the user enters Incorrect username and password
    And clicks on the Login button
    Then an error message "Invalid credentials" should be shown

  Scenario: Login with Incorrect Password
    Given the user is on the login page
    When the user enters valid username and incorrect password
    And clicks on the Login button
    Then an error message "Invalid credentials" should be shown

  Scenario: Login with Empty Username and Password 
    Given the user is on the login page
    When the user leaves both username and password fields empty
    And clicks on the Login button
    Then an error message "Please enter username and password" should be shown

  Scenario: Forget Password - Email Submission
    Given the user is on the login page
    When the user clicks on the 'Forgot Password' link
    And enters their email address
    And clicks on the Submit button
    Then the user should receive password reset instructions via email
    And the email should contain a link to reset the password




  Scenario Outline: Login with Different User Credentials
    Given User is on the Saucedemo login page
    When User enters username "<username>" and password "<password>"
    And clicks on the Login button
    Then the login status should be "<login_status>"

    Examples:
      | username               | password      | login_status  |
      | standard_user          | secret_sauce  | successful    |
      | problem_user           | secret_sauce  | unsuccessful  |
      | lockout_out_user       | secret_sauce  | unsuccessful  |
      | performance_glitch_user| secret_sauce  | successful    |