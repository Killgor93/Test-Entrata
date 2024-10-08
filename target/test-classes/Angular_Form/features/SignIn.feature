Feature: SignIn


  Scenario: User is the Can't schedule demo with out filleing all the Details
    Given user clicks on accept cookies button
    Then User Clicks on the schedule demo button
    Then user scroll to bottom of the page
    Then User Clicks on the schedule demo button with out filling all the details

  Scenario: User Fails to log in as Property Manager due to invalid Credentials
    Given user clicks on accept cookies button
    Given User clicks on sign in button
    Then Then User Clicks On the Property Manager login
    Then the user enters username
    Then the user enters password
    Then the user clicks on log in button

  Scenario: User is the Can't watch demo with out filleing all the Details
    Given user clicks on accept cookies button
    Then User clicks on the Watch Demo button
    Then user scroll to bottom of the page
    Then User Clicks on the watch demo button with out filling all the details



