#Feature: Title functionalities
  # Background: It runs before other things
#Given User open the browser
#    When User  will enters the URL
#  Scenario: Check Title
#    Given User open the browser
#    When User  will enters the URL
#    Then User verifies the title "Google" title
#  Scenario Outline:
#    Given User open the browser
#    When User  will enters the URL
#    And User enter the data "SearchData" of the product
#    Then User verify the search Result
#    Examples:
#    |SearchData|
#    |Rice      |
#    |Wheat     |


  Feature: Smart Bazar product price verification

    @smoke
    Scenario Outline: Verify product price for rice items
      Given User opens the browser and launches Smart Bazar
      And User closes the popUp on home page
      When User searches product "<SearchData>"
      And User selects product "<ProductName>"
      Then User should see the price "<ExpectedPrice>"

      Examples:
      | SearchData | ProductName | ExpectedPrice |
      | Rice       | Niru White Raw Rice (1kg)   | £2.59 |
      | Rice       | Clay Pongal Pot Pack (White Rice) | £15.99 |
#
#
