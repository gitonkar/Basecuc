@tag
Feature: Test login feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Test login 
    Given User is able to load "<url>" and validate basic details
    |validation|
    |https://developer.truist.com/web/home|
    |My Store|
    When User login with "<userid>" and "<pass>"
    Then User is on home page

    Examples: 
      | url										 								| userid 									  | pass 							 |
      | https://developer.truist.com/web/home	| GregMiebach@outlook.com 	| Greg@Miebach161295 |
      