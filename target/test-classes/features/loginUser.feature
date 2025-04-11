Feature: Login user to the application using loginAPI
@LoginUser
  Scenario Outline: User logs into the application using loginAPI
    Given login a user with "<email>" "<password>"
    When the user calls "LoginUser" with the "post" http request
    Then the LoginAPI call got success with status code 200
    
Examples:

|email|password|
|rohisiri123@fake.com|myPassword|