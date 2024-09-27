Feature: Google search Validation feature

Scenario Outline: Google search 
Given I search for <searchText>
Then I verify results contain <searchText>
Examples:
|searchText|
|Github|
|Udemy|
