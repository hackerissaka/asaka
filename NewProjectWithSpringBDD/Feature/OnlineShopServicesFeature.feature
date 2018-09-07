Feature: Test Online Shop Services

Scenario: User wants to test services of Online shopping Cart

When User give call to '/sayHello' services
Then user should receive service status 'Ok' And response message 'Hello world from Restful web services'

When user should provide submit valid product details
Then product details should successfully should add and same product details should return by services