Feature:  As an end user
          I want to search for a product
          so that I can view respective products
  Scenario Outline: valid search functionality

    Given I am on the homepage
    When  I search for a product "<searchItem>"
    Then  I should see all the products of "<searchItem>"

    Examples:
    |searchItem|
    |asus laptop|