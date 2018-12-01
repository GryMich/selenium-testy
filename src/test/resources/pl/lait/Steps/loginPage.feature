@tag
Feature: Flight reservation
  I want to use login and reserve some flight

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "Bobek" and pass "bobek"
    Then I should see flight reservation form 
    

Scenario: simple reservation prcess
	Given I open main page
	When I click on radiobutton round trip
	And I select number of passengers
	And I select departing from list
	And I select month from list
	And I select day from list
	And I select arriving in list
	And I select returning month and day
	And I select on radiobutton first class
	And I select airline from list
	And I click contiunue button
	Then I should see select flight form
	