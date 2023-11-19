Feature: Multiple Logins on Saucedemo

  Scenario Outline: Login with Different User Credentials
    Given User is on the Saucedemo dlogin page
    When User enters dusername "<username>" and password "<password>"
    And the clicks on the dLogin button
    Then the dlogin status should be "<login_status>"

    Examples:
      | username               | password      | login_status  |
      | standard_user          | secret_sauce  | successful    |
      | problem_user           | secret_sauce  | unsuccessful  |
      | lockout_out_user       | secret_sauce  | unsuccessful  |
      | performance_glitch_user| secret_sauce  | successful    |