@web
  Feature: Contact

    @[positive]_Send_Contact_Message
    Scenario: [Positive] send contact message
      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name "sigit"
      And input message text "have a good day"
      When user click send message button
      Then user get message box "Thanks for the message!!"

    @[negative]_Send_Contact_Message_(blank_email)
    Scenario: [negative] send contact message (blank email)
      Expected : User get alert message "Please fill at Contact Email !!"
      Actual : User get alert message "Thanks for the message!!"

      Given user on contact page
      And input email address ""
      And input name "sigit"
      And input message text "have a good day"
      When user click send message button
      Then user get message box "Thanks for the message!!"


    @[negative]_Send_Contact_Message_(blank_name)
    Scenario: [negative] send contact message (blank name)
    Expected : User get alert message "Please fill at Contact Name !!"
    Actual : User get alert message "Thanks for the message!!"

      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name ""
      And input message text "have a good day"
      When user click send message button
      Then user get message box "Thanks for the message!!"

    @[negative]_Send_Contact_Message_(blank_email)_(blank_message)
    Scenario: [negative] send contact message (blank email) (blank message)
    Expected : User get alert message "Please fill at Contact Name !!"
    Actual : User get alert message "Thanks for the message!!"

      Given user on contact page
      And input email address ""
      And input name "sigit"
      And input message text ""
      When user click send message button
      Then user get message box "Thanks for the message!!"

    @[negative]_Send_Contact_Message_(blank_email)_(blank_message)_(blank_name)
    Scenario: [negative] send contact message (blank email) (blank message) (blank name)
    Expected : User get alert message "Please fill at Contact Name !!"
    Actual : User get alert message "Thanks for the message!!"

      Given user on contact page
      And input email address ""
      And input name ""
      And input message text ""
      When user click send message button
      Then user get message box "Thanks for the message!!"

    @[cancel]_send_contact_message
    Scenario: [Cancel] Send Contact Message
      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name "sigit"
      And input message text "have a good day"
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_email)
    Scenario: [Cancel] Send Contact Message (blank email)
      Given user on contact page
      And input email address ""
      And input name "sigit"
      And input message text "have a good day"
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_name)
    Scenario: [Cancel] Send Contact Message (blank name)
      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name ""
      And input message text "have a good day"
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_message)
    Scenario: [Cancel] Send Contact Message (blank message)
      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name "sigit"
      And input message text ""
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_email)_(blank_name)
    Scenario: [Cancel] Send Contact Message (blank email) (blank name)
      Given user on contact page
      And input email address ""
      And input name ""
      And input message text "have a good day"
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_email)_(blank_message)
    Scenario: [Cancel] Send Contact Message (blank email) (blank message)
      Given user on contact page
      And input email address ""
      And input name "sigit"
      And input message text ""
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_name)_(blank_message)
    Scenario: [Cancel] Send Contact Message (blank name) (blank message)
      Given user on contact page
      And input email address "sigit_proud@gmail.com"
      And input name ""
      And input message text ""
      When user click close button contact
      Then user is redirect homePage

    @[cancel]_send_contact_message_(blank_email)_(blank_name)_(blank_message)
    Scenario: [Cancel] Send Contact Message (blank email) (blank name) (blank message)
      Given user on contact page
      And input email address ""
      And input name ""
      And input message text ""
      When user click close button contact
      Then user is redirect homePage