Feature: login into application

Scenario:
Given Initialize browser with chrome
And Navigae to "Qaclickacadey" site
And click on sign login link to land on secure sign in page
When user enters "Username" and "Password" and log in 
Then verify that user is successfully logged in