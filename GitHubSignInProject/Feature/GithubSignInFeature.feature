Feature: GitHub registeration functionality feature
@execute
Scenario: GitHub Registration
Given User is on 'Github.com' website
When user selects 'Sign In'
Then Github Registration should display

When user provides all required details And Enter submit
Then User account is created.