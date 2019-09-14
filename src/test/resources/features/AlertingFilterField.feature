Feature: Auto Process Functionalities

@Functional
Scenario Outline: Alerting API Test for Filter Value Functionality

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow1>"
Then I verify API response from Alert MS
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for UPDATE Request
Then I trigger CREATE Alert API request on Alert MS for "<TestCaseRow2>"
Then I verify New Alert created for New Request
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for UPDATE Request
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then I get ITSM Simulator Response for Current Alert
Then I verify If alert reached till ITSM Simulator

Examples:
|TestCaseRow1|TestCaseRow2|
|FilterValue1|FilterValue2|
|WithoutFilter|FilterValue1|
|FilterValue1|WithoutFilter|