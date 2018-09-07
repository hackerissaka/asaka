Feature: RedBus Booking Feature

@execute
Scenario: Booking ticket for 'bangalore' to 'chennai'
Given User is on 'RedBus Home Page'
When User provides "bangalore" and "chennai" as source and destination points
And select journey date
Then Book ticket for the corresponding details
And 'Enter person details'