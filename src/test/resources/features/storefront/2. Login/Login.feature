Feature: Login

  @smoke @regression
  Scenario: 1.1.3 Guest logs in with non existing account via Login page
    Given Guest has navigated to Login Page
    When Guest tries log in on Login Page
    Then global error message on Login Page is shown
