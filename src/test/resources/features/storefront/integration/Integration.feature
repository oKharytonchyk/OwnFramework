Feature: Integration

  @regression
  Scenario: 1.1.2 Guest saves suggested products on Home Page to file
    Given Guest has navigated to Home Page
    When Guest saves suggested products to file
    Then suggested products are saved to file
