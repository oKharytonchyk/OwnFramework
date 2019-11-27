Feature: Players

  @regression @role=customer
  Scenario: 1.1 Get Players
    When Client calls Get Players service
    Then response status code is 200
    And every player in response contains code, nickName
