
  Feature: Rest API Test Valid
    Scenario: Get Single Employee Info with Valid Get Request

      Given baseUrl and valid resourcePath
      When Make a valid GET Call
      Then I should receive status code 200
