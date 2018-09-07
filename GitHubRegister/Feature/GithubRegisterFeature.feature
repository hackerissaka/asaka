Feature: GitHub register functionality feature

Scenario: User is trying to create account in github
Given user is on github home page and user select 'sign up' option
When user select 'sign up' option
Then user need to be taken to github 'sign up' page
@execute
Scenario: User is trying to create account in github using valid details
Given user is on github home page and user select 'sign up' option
When user enter valid details and select 'create an account'
Then user created account successfully