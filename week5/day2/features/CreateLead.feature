Feature: Create Lead in LeapTaps Application 

Scenario Outline: Create Lead with Mutliple data
Given Launch browser and load the URL
When Enter the user name as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login button
Then Verify the login is successful
When Click on crmsfa button
And Click on Leads tab
And Click on Create Lead button
And Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And Click Submit button
Then Verify Lead is created 

Examples:
|companyname|firstname|lastname|
|'TestLeaf'|'Dilip'|'Kumar'|
|'TestLeaf'|'Saranya'|'R'|