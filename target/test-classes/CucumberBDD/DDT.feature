
Feature: I want to test the login functionality 

  
  Scenario Outline: Login to the website
    Given open the link
    When enter credentials <username> and <password>
    Then I validate the outcomes
    
 	Examples:
 	|username|password|
 	|Vishnu|12345|