Feature: SignIn


  Scenario Outline: User is the Can't schedule demo with out filleing all the Details
    Given user clicks on accept cookies button
    Then User Clicks on the schedule demo button
    Then user scroll to bottom of the page
    Then User Clicks on the schedule demo button with out filling all the details
#    Then user scroll to top of the page
    Then user should able to see "<error>" message
    Examples:
      | error |
      | This field is required.|


  Scenario Outline: User Fails to log in as Property Manager due to invalid Credentials
    Given user clicks on accept cookies button
    Given User clicks on sign in button
    Then Then User Clicks On the Property Manager login
    Then the user enters username
    Then the user enters password
    Then the user clicks on log in button
    Then the user gets "<errormsg>" invalid credentials
    Examples:
      |errormsg|
      |The username and password provided are not valid. Please try again.|


  Scenario Outline: User is the Can't watch demo with out filleing all the Details
    Given user clicks on accept cookies button
    Then User clicks on the Watch Demo button
    Then user scroll to bottom of the page
    Then User Clicks on the watch demo button with out filling all the details
    Then user scroll to top of the page
    Then user should able to see "<error>" message
    Examples:
      | error |
      | This field is required.|



