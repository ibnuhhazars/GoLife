Feature: HTTP Method

  Scenario: GET Http Method
    When i call GET "http://httpbin.org/get"
    Then i get receive status code of 200
    And i verify Response "args" is "{}"
    And i verify Response "headers.Accept" is "*/*"
		And i verify Response "headers.Host" is "httpbin.org"
		And i verify Response "url" is "https://httpbin.org/get"
		
  Scenario: POST Http Method
    When i call POST "http://httpbin.org/post"
    Then i get receive status code of 200
 		And i verify Response "args" is "{}"
    And i verify Response "headers.Accept" is "*/*"
		And i verify Response "headers.Host" is "httpbin.org"
		And i verify Response "url" is "https://httpbin.org/post"