@regression
Feature: Insta likes
  I want to use this to get likes for my post

  Scenario: Get likes from browser
    Given Open the browser
    When I give the "https://www.instagram.com/reel/C3auZ6sySPY/?utm_source=ig_web_copy_link" in the step
    Then I give the "vishnusuriya619@gmail.com" in step
    And click on ok

  
