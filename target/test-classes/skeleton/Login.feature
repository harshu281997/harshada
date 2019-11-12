Feature: Login Test

Scenario: Login with valid Test Data

Given  user launches internetexplorer and navigates to application
When user enters username as "mercury" in username field
When user enters password as "mercury" in password field
And click Signin
Then validates Login Success