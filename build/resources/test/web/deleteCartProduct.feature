@web
  Feature: Delete Product At Cart


    @[positive]_delete_product_phone_Nexus_6_at_list_cart
    Scenario: [positive] Delete product phone "nexus 6" at list cart
      Given product "Nexus 6" already added to cart list
      When user click delete button
      Then product delete from cart list

    @[positive]_delete_product_at_list_cart_(scenario_outline)
    Scenario Outline: [positive] Delete product at list cart (scenario outline)
      Given product <listProduct> already added to cart list
      When user click delete button
      Then product delete from cart list
      Examples:
      | listProduct        |
      |  "Sony xperia z5"  |
      |  "Iphone 6 32gb"   |