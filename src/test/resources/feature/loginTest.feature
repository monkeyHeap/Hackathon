@SmokeTest
Feature: Login
  Scenario: Login
    * Goto login page
    * Login "monkeyheap@yandex.ru" password "<qwer1234>"
    * Check field WELCOME

  @SmokeTest
  Scenario: Login
    * Goto login page