
  Feature: Rest API Test InValid
    Scenario: Get Single Employee Info with InValid Get Request

      Given baseUrl and InValid resourcePath
      When Make a InValid GET Call
      Then I should receive status code 404
