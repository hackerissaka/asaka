Feature: Registration Form

  Scenario: user is trying to register without entering credentials
    Given user is on personal details registration page
    Then personal details registration page should load with title 'Personal Details'
    And 'Step 1: Personal Details' text should display
    
    When user will click on next without entering First Name
    Then 'Please fill the First Name' message should display
    
    When user will click on next without entering Last Name
    Then 'Please fill the Last Name' message should display
    
    When user will click on next without entering Email
    Then 'Please fill the Email' message should display
    
    When user will click on next without entering Contact no.
    Then 'Please fill the Contact No.' message should display
    
    When user will click on next withot entering valid Contact no. 
    Then 'Please enter valid Contact no.' message should display
    
    When user will click on next without entering Address line 1
    Then 'Please fill the address line 1' message should display
    
    When user will click on next without entering in Address line 2
    Then 'Please fill the address line 2' message should be display
    
    When user will click on next without selecting City
    Then 'Please select city' message should display
    
    When user will click on next without selecting State
    Then 'Please select state' message should display
  
    When user will click on next by entering all valid details 
    Then 'Personal details are validated and accepted successfully.' message should display
    And navigates to the Educational details page
   
    When user is on Education details page
    Then personal details registration page should load with  with title 'Educational Details'
    And 'Step 2: Educational Details' text should display
    
    When user clicks on Register Me without selecting Graduation
    Then 'Please select Graduation' message should display
    
    When user clicks on Register Me without entering Percentage
    Then 'Please fill Percentage details' message should display
    
    When user clicks on Register Me without entering Passing Year
    Then 'Please fill Passing Year' message should display
    
    When user clicks on Register Me without entering Project Name
    Then 'Please fill Project Name' message should display
    
     When user will click on Register Me without selecting Technologies used
    Then 'Please Select Technologies Used' message should display
    
    When user will click on Register Me without entering otherTechnologies in case of 'other' option selected
    Then 'Please fill other Technologies Used' message should display
    
    When user clicks on Register Me with valid details
    Then 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' message should display