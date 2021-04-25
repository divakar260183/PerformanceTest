Feature: sample karate test script


  Background:
    * url 'https://google.com/search?q='


  Scenario: get all users
    Given path 'shoes'
    When method get
    Then status 200
