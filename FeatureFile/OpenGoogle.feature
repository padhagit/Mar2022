Feature: This is to test Google Search
Scenario: Google Search Scenario
Given user is entering google.co.in
When user is typing the search term "besant technologies"
And enters the return key
Then the user should see the search results