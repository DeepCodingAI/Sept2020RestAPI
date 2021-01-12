$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/GetSingleEmployeeInValidCall.feature");
formatter.feature({
  "name": "Rest API Test InValid",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info with InValid Get Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and InValid resourcePath",
  "keyword": "Given "
});
formatter.match({
  "location": "GetSingleEmployeeInValidCall.baseurl_and_InValid_resourcePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make a InValid GET Call",
  "keyword": "When "
});
formatter.match({
  "location": "GetSingleEmployeeInValidCall.make_a_InValid_GET_Call()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "GetSingleEmployeeInValidCall.i_should_receive_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/GetSingleEmployeeValidCall.feature");
formatter.feature({
  "name": "Rest API Test Valid",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info with Valid Get Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and valid resourcePath",
  "keyword": "Given "
});
formatter.match({
  "location": "GetSingleEmployeeValidCall.baseUrlAndResourcePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make a valid GET Call",
  "keyword": "When "
});
formatter.match({
  "location": "GetSingleEmployeeValidCall.makeAValidGETCall()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "GetSingleEmployeeValidCall.IShouldReceiveStatusCode200()"
});
formatter.result({
  "status": "passed"
});
});