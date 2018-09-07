Feature: Test Product Cart Management Services


Scenario: User wants to test Services of Product Cart Management

When User give call to '/sayHello' Service
Then  user should receive service status 'OK' And response message 'Hello World From RestFulWebService'


Scenario: User want to add product details

When User give call to '/createProduct' service
And user provides valid product details
Then user should be able to add product details and same product details must be returned by service
And should receive service status 'OK'


Scenario: User want to get product details by id

When user give call to 'getProductById' service
And user provide valid project details
Then product details must be returned by service
And  user should receive service status 'OK'

Scenario: User want to get all product details

When user give call to 'getProductDetails' service
Then all product details must be returned by service
And  user receive service status 'OK'

@execute
Scenario: User want to update product details

When user give call to 'updateProduct' service
And user provide updated valid product details
Then all product details will be updated and same product must be returned by service