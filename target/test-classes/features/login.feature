Feature: User Login to the application Test

  @admin-login
  Scenario Outline: Login to as Admin
  Given User is on login page
  When User enters valid email "<email>" and password "<password>"
  Then User should be able to login

    Examples:
      | email               | password          |
      | aashish@dvsum.com   | Tempfor@Adnan1    |