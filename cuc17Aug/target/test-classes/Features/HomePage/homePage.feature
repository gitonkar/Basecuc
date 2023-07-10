
@devPortal @homePage
Feature: Home Page
  The Home Page for Dev Portal
 
	Background:
	
	Given the home page for Dev Portal is reached and title verified
	| https://developer.truist.com/web/home	|
	
	@happy @us333862 @tc156003
	Scenario: The navigation section of the home page is correct
		Then the home page navigation section has the following links
			|Home		|
			|APIs		|
			|Support|
		And the home page navigation section has the Truist logo
		And the home page navigation section has the "Sign in" button
		
	@wip @happy @us333862 @tc156001
  Scenario: The hero section of the home page is correct
    Then the home page hero section has the "Register" button
    And the home page hero section has the "TRUIST DEVELOPER CENTER" CapHeading
    And the home page hero section has the "Developers are redefining the future of banking."  heading 
    And the home page hero section has the "By transforming how our clients use our services, we can accelerate growth." subheading
    
  @happy @us333862 @tc156002
  Scenario: Verify the Truist APIs section of the home page is correct
		Then the API Categories section has the following links
		|Commercial - Association Services|
		|Personal and small business|
		|Accounts and transactions|
		And the home page Truist APIs section has the "Truist APIs" heading
		And the home page Truist APIs section has the "Tap into the power of the Truist network with our APIs."
   

   
      

