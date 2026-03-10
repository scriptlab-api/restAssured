Feature: Health Check API

  Scenario: Verify API is running
    Given the API endpoint is available
    When I send a GET request to "/booking"
    Then the response status should be 200