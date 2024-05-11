@web
  Feature: Purchasing product

    @[positive]_verify_user_can_purchase_product
    Scenario: [positive] verify user can purchase product
      Given user is on orderPage
      And user input name with "santa"
      And user input country with "Indonesia"
      And user input city with "Bogor"
      And user input credit card with "242591283098"
      And user input month with "December"
      And user input year with "2024"
      When user click purchase button
      Then product already process purchase


    @[positive]_verify_user_can_purchase_product_only_with_name_and_credit_card
    Scenario: [positive] verify user can purchase product only with credit card and name
      Given user is on orderPage
      And user input name with "santa"
      And user input country with ""
      And user input city with ""
      And user input credit card with "242591283098"
      And user input month with ""
      And user input year with ""
      When user click purchase button
      Then product already process purchase

    @[positive]_verify_user_can_cancel_purchase_product
    Scenario: [positive] verify user can cancel purchase product
      Given user is on orderPage
      And user input name with "santa"
      And user input country with "Indonesia"
      And user input city with "Bogor"
      And user input credit card with "242591283098"
      And user input month with "December"
      And user input year with "2024"
      When user click close button
      Then user is on cartPage

    @[negative]_verify_user_cant_purchase_product_(blank_input_name)
    Scenario: [negative] verify user cant purchase product (blank input name)
      Given user is on orderPage
      And user input name with ""
      And user input country with "Indonesia"
      And user input city with "Bogor"
      And user input credit card with "242591283098"
      And user input month with "December"
      And user input year with "2024"
      When user click purchase button
      Then user get message alert "Please fill out Name and Creditcard."

    @[negative]_verify_user_cant_purchase_product_(blank_input_creditcard)
    Scenario: [negative] verify user cant purchase product (blank input creditcard)
      Given user is on orderPage
      And user input name with "santa"
      And user input country with "Indonesia"
      And user input city with "Bogor"
      And user input credit card with ""
      And user input month with "December"
      And user input year with "2024"
      When user click purchase button
      Then user get message alert "Please fill out Name and Creditcard."