Feature: Next Birthday API

  Scenario: Calculate time left until the next birthday
    Given the user's date of birth is "1987-08-20"
    When I request the time left until the next birthday in "hour"
    Then the API should return "456 hours left"

    Given the user's date of birth is "1987-08-20"
    When I request the time left until the next birthday in "day"
    Then the API should return "19 days left"

    Given the user's date of birth is "1987-08-20"
    When I request the time left until the next birthday in "week"
    Then the API should return "2 weeks left"

    Given the user's date of birth is "1987-08-20"
    When I request the time left until the next birthday in "month"
    Then the API should return "0 months left"
