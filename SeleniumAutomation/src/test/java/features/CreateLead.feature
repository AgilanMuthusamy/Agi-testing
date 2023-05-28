Feature:  leaftabs CreateLead functionality 

#Background:
#Given Open the Chrome Browser 
#And Load the application url 'http://leaftaps.com/opentaps/control/login'


Scenario Outline: CreateLead with mandatory informations 


	Given Enter username as <username>
	And Enter password as <password> 
	When Click on login button 
	Then Homepage should be displyed 
	When Click on 'CRM/SFA' link
	Then 'My Home' page should be displayed
	When Click on 'Leads' link
	Then 'My Leads' page should be displayed
	When Click on 'Create Lead' link
	Then 'Create Lead' page should be displayed
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
	#	|'DemoCSR'|'crmsfa'|
	
	