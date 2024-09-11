Feature: Create Account in Salesforce Application 

Scenario: Create Account for Sales
Given Launch browser and load the URL
When Enter the user name as dilip@testleaf.com
And Enter the password as August@2024
And Click on Login button
Then Verify the login is successful
When Click on toggle menu button from left corner
And Click view All
And Click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter yourname as priyarajan
And Select Ownership as Public
When Click save button
Then Verify Account name 