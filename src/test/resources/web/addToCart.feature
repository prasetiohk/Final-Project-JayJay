@web
  Feature: add product to cart

    @[positive]_add_product_Nexus_6_to_cart
    Scenario: [Positive] verify user added product phone "Nexus 6" to cart
      Given user is on detail product page "Nexus 6"
      When user click button add to cart
      Then Product "Nexus 6" add to cart

    @[positive]_add_product_to_cart_(Scenario_outline)
    Scenario Outline: [Positive] verify user can added product to cart
      Given user is on detail product page <product_name>
      When user click button add to cart
      Then Product <product_name_add> add to cart
      Examples:
      | product_name       |  product_name_add    |
      | "Sony xperia z5"   |  "Sony xperia z5"    |
      | "Iphone 6 32gb"    |  "Iphone 6 32gb"     |