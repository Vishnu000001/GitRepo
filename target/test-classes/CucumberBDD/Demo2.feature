
Feature: Testing
  I want to use this template for my feature file
 
  Scenario Outline: 
    Given Open the browser
    When I enter the <name> and <email>
   
    Examples: 
      | name  | email | 
      | vishnu |     vishnu@gamil.com | 
      | Nc |     nc@gmail.com | 
