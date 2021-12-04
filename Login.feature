Feature: Login functionality for Leaftaps application

Background: 
Given Open Chrome browser
And Load application url

Scenario Outline: Login with positive credentials
And Enter Username as <username>
And Enter password as <password>
When Click on Login button
Then Home Page should be displayed
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'Democsr'|'crmsfa'|

Scenario Outline: Login with negative credentials
And Enter Username as <username>
And Enter password as <password>
When Click on Login button
But Error message is displayed
Examples:
|username|password|
|'Demosales'|'crms'|

