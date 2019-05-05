Feature: api test

  Scenario: Method Put API saja
    When i pos request body:
      """
      {"id":6,"title":"Mr","firstName":"Ibnuh","lastName":"Hazar","phoneNumber":"01962 000000"}
      """
    And i call post "http://10.1.77.73:7819/RTCP/examples/phonebook/api/"
    Then i get receive status code of 200
    And the response should contain:
      """
      {"id":6,"title":"Mr","firstName":"Ibnuh","lastName":"Hazar","phoneNumber":"01962 000000"}
      """
