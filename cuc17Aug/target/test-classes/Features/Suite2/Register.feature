@tag
Feature: Test Register feature
  I want to use this template for my feature file

  @tag1
	Scenario Outline: Test Register
   	Given user is on "<url>" Home page
    When User able to click on Register button
    Then User able to navigate on Create an account
		And User able to enter create accoutn details
			
      |test1st	 |test1lst	 |test1cmp			|test1email			|
			|test2st	 |test2lst	 |test2cmp			|test2email			|
			|test3st	 |test3lst	 |test3cmp			|test3email			|
			|test4st	 |test4lst	 |test4cmp			|test4email			|
		
		Then User able to click on submit button 
		
      Examples: 
      | url										 								|
      | https://developer.truist.com/web/home	|