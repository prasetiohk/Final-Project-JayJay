@web
  Feature: Login

    @[positive]_valid_login_success
    Scenario: [positive] login using valid username and valid password
      Given user is on login page
      And user input username with "harianto1"
      And user input password with "t3st1ng"
      When user click login button
      Then user is on homepage

    @[positive]_valid_login_success_(scenario_outline)
    Scenario Outline: [positive] login using valid username and valid password (scenario outline)
      Given user is on login page
      And user input username with <username>
      And user input password with <password>
      When user click login button
      Then user is on homepage
      Examples:
      |  username   | password  |
      | "harianto1" | "t3st1ng" |
      | "harianto2" | "t3st1ng" |
      | "harianto3" | "t3st1ng" |

    @[negative]_invalid_login_(wrong_password)
    Scenario: [negative] login using valid username and invalid password
      Given user is on login page
      And user input username with "harianto1"
      And user input password with "password"
      When user click login button
      Then user get error message "Wrong password."

    @[negative]_invalid_login_(user_does_not_exist)
    Scenario: [negative] login using invalid username and valid password
      Given user is on login page
      And user input username with "sdgsgegsddvs"
      And user input password with "t3st1ng"
      When user click login button
      Then user get error message "User does not exist."


    @[negative]_invalid_login_(blank_username)
    Scenario: [negative] login using blank username
      Given user is on login page
      And user input username with ""
      And user input password with "t3st1ng"
      When user click login button
      Then user get error message "Please fill out Username and Password."


    @[negative]_invalid_login_(blank_password)
    Scenario: [negative] login using blank password
      Given user is on login page
      And user input username with "harianto1"
      And user input password with ""
      When user click login button
      Then user get error message "Please fill out Username and Password."

    @[negative]_invalid_login_(blank_password)_(blank_username)
    Scenario: [negative] login using blank password and blank username
      Given user is on login page
      And user input username with ""
      And user input password with ""
      When user click login button
      Then user get error message "Please fill out Username and Password."

    @[negative]_invalid_login_(scenario_outline)
    Scenario Outline: [negative] invalid login (scenario outline)
      Given user is on login page
      And user input username with <username>
      And user input password with <password>
      When user click login button
      Then user get error message <errorMessage>
      Examples:
      |    username     |    password    |    errorMessage                                |
      |  "harianto1"    |  "password"    | "Wrong password."                              |
      |   "sgwegwegweg" |  "password"    | "User does not exist."                         |
      |  "harianto1"    |      ""        | "Please fill out Username and Password."       |
      |      ""         |   "password"   | "Please fill out Username and Password."       |
      |      ""         |   ""           | "Please fill out Username and Password."       |

    @[negative]_cancel_login_(input_username)_(input_password)_(close)
    Scenario: [negative] cancel login input username and password (close)
      Given user is on login page
      And user input username with "harianto1"
      And user input password with "t3st1ng"
      When user click on close button
      Then user is on first page

    @[negative]_cancel_login_(input_username)_(blank_password)_(close)
    Scenario: [negative] cancel login input username and blank password (close)
      Given user is on login page
      And user input username with "harianto1"
      And user input password with ""
      When user click on close button
      Then user is on first page

    @[negative]_cancel_login_(blank_username)_(input_password)_(close)
    Scenario: [negative] cancel login input username and blank password (close)
      Given user is on login page
      And user input username with ""
      And user input password with "t3st1ng"
      When user click on close button
      Then user is on first page

    @[negative]_cancel_login_(blank_username)_(blank_password)_(close)
    Scenario: [negative] cancel login input username and blank password (close)
      Given user is on login page
      And user input username with ""
      And user input password with ""
      When user click on close button
      Then user is on first page