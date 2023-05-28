Feature: Test leaftabs login functionality 

#Background:
#Given Open the Chrome Browser 
#And Load the application url 'http://leaftaps.com/opentaps/control/login'


Scenario Outline: Test with positive credential 


	And Enter username as <username> 
	And Enter password as <password> 
	When Click on login button 
	Then Homepage should be displyed 
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
		|'DemoCSR'|'crmsfa'|
		
		
Scenario: Test with negative credential 

	And Enter username as 'Demo' 
	And Enter password as 'crmsfa' 
	When Click on login button 
	But Error message should be displyed