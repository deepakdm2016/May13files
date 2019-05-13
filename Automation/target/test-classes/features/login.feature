Feature: Application loggin

Scenario: Home page default logins
Given User is on landing page
When user login into application with username "abc" and password "xyz"
Then home page is populated
And Cards are displayed


Scenario: Home page default logins
Given User is on landing page
When user login into application with username "tyu" and password "pop"
Then home page is populated
And Cards are displayed
