
Feature: Adding user to the application
@AddUser
  Scenario Outline: Add a user to the application
    Given Add a user Payload with "<firstName>" "<lastName>" "<email>" "<password>"
    When user calls "AddUser" with the "post" http request
    Then the API call got success with status code 201
    
Examples:

|firstName|lastName|email|password|
|Rohith|Reddy|rohithreddyqa3535@mailinator.com|vale-ROSSI|