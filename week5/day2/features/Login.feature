Feature: Login LeapTaps Application with the valid credential

Scenario: Login to the application with positive data
Given Launch browser and load the URL
When Enter the user name as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login button
Then Verify the login is successful

Scenario: Login to the application with positive data
Given Launch browser and load the URL
When Enter the user name as 'DemoSales'
And Enter the password as 'crmsfa'
And Click on Login button
But Verify the login is not successful
