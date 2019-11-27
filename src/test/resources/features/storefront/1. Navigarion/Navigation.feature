Feature: Navigation

  @regression
  Scenario: 1.1.1 Guest navigates to Category Page
    When Guest navigates to WEBCAMS Category Page
    Then WEBCAMS Category Page is opened
    And WEBCAMS breadcrumb is active on PLP
