Feature: Create a User From API and Login from UI
@AddUser
Scenario Outline: Add a user to the application
    Given Add a user Payload with "<firstName>" "<lastName>" "<email>" "<password>"
    When user calls "AddUser" with the "post" http request
    Then the API call got success with status code 201

Examples:

|firstName|lastName|email|password|
|Rohith|Reddy|rohithreddyqa2206@mailinator.com|vale-ROSSI|    

@LoginFromUI
Scenario Outline: Login into UI with the above created user using UI
    Given the "<email>" and "<password>" for created user
    When the user the navigates to the "<site>" and enters the "<email>" and "<password>"
    And the user clicks the submit button to login
    Then the user lands into the homepage

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
