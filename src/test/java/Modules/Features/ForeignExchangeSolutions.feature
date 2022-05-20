Feature: International Payment Articles

  Background:
    Given Open the Browser and Site is launched

  @InternationalPayment
  Scenario Outline: Validate International Payment Article links start with https://www.moneycorp.com/en-us/
    And Click on language and change to "<Language>"
    And Click on find out more under Foreign Exchange Solutions
    And Validate the Foreign Exchange Solutions Page
    And Search for "international payments"
    And Validate the international payment result page
    Then Validate the each article which is start with https://www.moneycorp.com/en-us/ link

    Examples:
    |Language|
    |USA English|

