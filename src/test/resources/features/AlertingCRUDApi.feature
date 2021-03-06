Feature: Juno Alerting Basic Functionality Test

@Functional @BVT
Scenario Outline: Alerting API Test for Under Research Windows/SQL Condition - "<TestCaseRow>"

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response from Alert MS
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for UPDATE Request
#When I trigger CREATE Incident API request on ITSM MS
#Then I verify Duplicate Alert in API response from ITSM MS
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response from ITSM MS for UPDATE Request
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then I get ITSM Simulator Response for Current Alert
Then I verify If all requests were sent to ITSM
Then I should verify ITSM payload data as expected
#Then I trigger DELETE API request on ITSM MS
#Then I verify API response "404" from Alert MS for "DELETE" Request
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response "404" from Alert MS for "UPDATE" Request
Examples:
|TestCaseRow|
|UnderResearchWindows|
|UnderResearchSQL|


@Functional @BVT @ignore
Scenario Outline: Alerting API Test for JAS Condition - "<TestCaseRow>"

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response from Alert MS
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for UPDATE Request
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response from ITSM MS for UPDATE Request
Then I verify If alert is Created in JAS
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then I verify If alert is Deleted in JAS
Then I get ITSM Simulator Response for Current Alert
Then I verify If alert not reached till ITSM Simulator
#Then I trigger DELETE API request on ITSM MS
#Then I verify API response "404" from Alert MS for "DELETE" Request
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response "404" from Alert MS for "UPDATE" Request
Examples:
|TestCaseRow|
|DM 2.0|
#|BDR|
#|Security|


@Functional @BVT
Scenario Outline: Alerting API Test for Site/Partner/Client Level Alert - "<TestCaseRow>"

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response from Alert MS
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for UPDATE Request
#When I trigger CREATE Incident API request on ITSM MS
#Then I verify Duplicate Alert in API response from ITSM MS
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response from ITSM MS for UPDATE Request
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then I get ITSM Simulator Response for Current Alert
Then I verify If all requests were sent to ITSM
Then I should verify ITSM payload data as expected
#Then I trigger DELETE API request on ITSM MS
#Then I verify API response "404" from Alert MS for "DELETE" Request
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response "404" from Alert MS for "UPDATE" Request
#When I trigger CREATE Incident API request on ITSM MS
#Then I verify Duplicate Alert in API response from ITSM MS
#Then I trigger DELETE API request on ITSM MS
#Then I verify API response "404" from Alert MS for "DELETE" Request
Examples:
|TestCaseRow|
|SiteLevel|
|ClientLevel|
|PartnerLevel|


@Functional @BVT
Scenario Outline: Alerting CREATE API Test for Duplicate Alert

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response from Alert MS
Then I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response as Duplicate Alert Request from Alert MS
#When I trigger CREATE Incident API request on ITSM MS
#Then I verify Duplicate Alert in API response from ITSM MS
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response from ITSM MS for UPDATE Request
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then Pause execution for "20" seconds
#Then I trigger DELETE API request on ITSM MS
#Then I verify API response "404" from Alert MS for "DELETE" Request
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response "404" from Alert MS for "UPDATE" Request
Examples:
|TestCaseRow|
|UnderResearchDuplicate|


@Functional @BVT
Scenario Outline: Alerting DELETE/UPDATE API Test for Non-Existing Alert

Given I trigger CREATE Alert API request on Alert MS for "<TestCaseRow>"
Then I verify API response from Alert MS
#When I trigger CREATE Incident API request on ITSM MS
#Then I verify Duplicate Alert in API response from ITSM MS
#Then I trigger UPDATE ITSM API request on ITSM MS
#Then I verify API response from ITSM MS for UPDATE Request
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for DELETE Request
Then Wait for "10" Secs
Then I trigger UPDATE Alert API request on Alert MS
Then I verify API response from Alert MS for Non-Existing Alert
Then I trigger DELETE API request on Alert MS
Then I verify API response from Alert MS for Non-Existing Alert
 # Then I trigger DELETE API request on ITSM MS
 # Then I verify API response "404" from Alert MS for "DELETE" Request
 # Then I trigger UPDATE ITSM API request on ITSM MS
 # Then I verify API response "404" from Alert MS for "UPDATE" Request
Examples:
|TestCaseRow|
|UnderResearchNonExistingDeleteUpdate|