Feature: User Signup

  Scenario: Successfulaccount creation using valid email and password
    Given User launch the browser and enter the URL.
    When User click on Create Account
    Then verify that user land on create signup page
    Then User enters valid first name, last name, email, password and confirm password.
    Then User is redirected to the dashboard page
    Then User quit the driver