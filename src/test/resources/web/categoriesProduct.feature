@web
  Feature: display product by categories
    @[positive]_product_by_categories_phones
    Scenario: [Positive] Display product by phones categories
      Given user is on homePage
      When user click text-link phones categories
      Then user see display product by phones categories


    @[positive]_product_by_categories_laptops
    Scenario: [Positive] Display product by laptops categories
      Given user is on homePage
      When user click text-link laptops categories
      Then user see display product by laptops categories


    @[positive]_product_by_categories_monitors
    Scenario: [Positive] Display product by monitors categories
      Given user is on homePage
      When user click text-link monitors categories
      Then user see display product by monitors categories

    @[positive]_display_product_by_categories
    Scenario Outline: [positive] valid user can display product by categories
      Given user is on homePage
      When user click text-link categories <category>
      Then user see display product by <categoryName> categories
      Examples:
      |  category            |  categoryName   |
      |  "Phones"            |  "Phones"       |
      |  "Monitors"          |  "Monitors"     |
      |  "Laptops"           |  "Laptops"      |