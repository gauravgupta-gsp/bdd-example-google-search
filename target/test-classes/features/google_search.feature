Feature: Test Google Search functionality  

  Scenario: Test Google Search
    Given I have opened the browser
    And I am on Google Search page
    When I search for "Wells Fargo"  
    Then search results should contain "Wells Fargo" 