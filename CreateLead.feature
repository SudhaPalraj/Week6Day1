Feature: Login functionality for createLead application

Background: 
Given Open Chrome browser
And Load application url

Scenario Outline: Login with mandatory fields 
And Enter Username as <username>
And Enter password as <password>
When Click on Login button
Then Home Page should be displayed
When Click on crmsfa link
Then MyHome should be displayed


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|




