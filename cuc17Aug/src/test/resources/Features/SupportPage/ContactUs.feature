@devPortal @ContactUs @Support
Feature: ContactUs Page
  The ContactUs Page for Dev Portal
  
  Background:
	
	Given the home page for Dev Portal is reached and title verified
	| https://developer.truist.com/web/home	| 
   
	@happy @us333862 @tc156003
	Scenario: The Support tab ContactUs page is correct
		When User click on support nav arrow
		Then User able to click "Contact Us" link
		And User able to validate Contact Us page url and title loaded.
		|https://developer.truist.com/web/contact-us|Support \| Contact Us \| Truist Developer Center|
		And User able to verify "TRUIST DEVELOPER CENTER" CapHeading
		And User able to verify "Contact Us" page heading 
		And User able to verify "Create an account" link on page
		
		
	@wip @happy @us333862 @tc156001
  Scenario: The Contact Us form filling working correct
    And User fill the ContactUs form.
     |esfsfsfs|sxdfvsds|dsss@efwef.com|555-555-5555|General technical support|sfsfsdg|
    And User click on "Cancel" button
    And User Validate "Thanks for the feedback" message.
      
     
     
      