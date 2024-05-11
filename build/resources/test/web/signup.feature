@web
  Feature: Signup

    @[negative]_signup_existing_username_(harianto1)
    Scenario: [negative] signup with existing username (harianto1)
      Given user is on signup page
      And user input username signup with "harianto1"
      And user input password signup with "t3st1ng"
      When user click sign up button
      Then user get error message "This user already exist."

    @[negative]_signup_existing_username_(scenario_outline)
    Scenario Outline: [negative] signup with existing username (scenario outline)
      Given user is on signup page
      And user input username signup with <username>
      And user input password signup with <password>
      When user click sign up button
      Then user get error message <error message>
      Examples:
      |   username    |    password    |    error message           |
      | "harianto1"   |   "t3st1ng"    | "This user already exist." |
      | "harianto2"   |   "t3st1ng"    | "This user already exist." |
      | "harianto3"   |   "t3st1ng"    | "This user already exist." |

    @[negative]_signup_(blank_username)
    Scenario: [negative] signup with blank username
      Given user is on signup page
      And user input username signup with ""
      And user input password signup with "t3st1ng"
      When user click sign up button
      Then user get error message "Please fill out Username and Password."

    @[negative]_signup_(blank_password)
    Scenario: [negative] signup with blank password
      Given user is on signup page
      And user input username signup with "harianto1"
      And user input password signup with ""
      When user click sign up button
      Then user get error message "Please fill out Username and Password."

    @[negative]_signup_(blank_username)_(blank_password)
    Scenario: [negative] signup with blank username
      Given user is on signup page
      And user input username signup with ""
      And user input password signup with ""
      When user click sign up button
      Then user get error message "Please fill out Username and Password."

    @[negative]_cancel_signup_(input_username)_(input_password)_(close)
    Scenario: [negative] cancel signup with input username and password
      Given user is on signup page
      And user input username signup with "harianto1"
      And user input password signup with "t3st1ng"
      When user click cancel sign up button
      Then user is on first page

    @[negative]_cancel_signup_(input_username)_(blank_password)_(close)
    Scenario: [negative] cancel signup with input username and blank password
      Given user is on signup page
      And user input username signup with "harianto1"
      And user input password signup with ""
      When user click cancel sign up button
      Then user is on first page

    @[negative]_cancel_signup_(blank_username)_(input_password)_(close)
    Scenario: [negative] cancel signup with input username and password
      Given user is on signup page
      And user input username signup with ""
      And user input password signup with "t3st1ng"
      When user click cancel sign up button
      Then user is on first page

    @[negative]_cancel_signup_(blank_username)_(blank_password)_(close)
    Scenario: [negative] cancel signup with input username and password
      Given user is on signup page
      And user input username signup with ""
      And user input password signup with ""
      When user click cancel sign up button
      Then user is on first page
