Feature: Naukri create account feature
Using this feature user can create new accounr in Naukri

@execute
Scenario: User tries to create account in Naukri with valid credentials
Given user is in home page of Naukri and selects register option
When user selects 'I am proffesional option'
Then personal details form should open
When user fills all personal details and submits 
Then Employment form should open
When user fills all employment details and submit
Then Education form should open