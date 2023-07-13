
Feature: Project Document
  
  Scenario: login test for facebook
   Given i open browser "chrome"
   And I navigate to "https://www.facebook.com/"
    When i enter usernmae "sonali.mis0@gmail.com"
    And i enter password "wrong passwd"
    And  I click submit
   Then error message must come 

   @Google
  Scenario Outline: 
    	Given I open "Chrome" and i went to < http://www.google.com>
    	When I search the <keyword>
    	Then result must come

    Examples: 
    	| url  | keyword | 
    	| http://www.google.com | pizza | 
    	| http://www.google.com | burger |
  