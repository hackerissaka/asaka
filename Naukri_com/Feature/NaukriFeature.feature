Feature: Naukri Registration Functionality Feature
@execute
Scenario: User is trying to 'create a new account' using valid details
Given User is on 'naukri home page' and select 'register with us'
When User provide valid details and click 'continue'
Then User account has been created