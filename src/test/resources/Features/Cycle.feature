Feature: Cycle
#Scenario: Login using valid account
#Given open app
#And fill username <username> and password <password>
#When click contoinue button
#Then new task page is display

Scenario: Load New Task
When Select Equipment
And select Task
Then equipment and task has selected

Scenario: Load and Save TWI Delay
Given select Yes for load TWI
And compleate form
When Save Delay
Then back to Mining task Page

Scenario: Navigate to summary screen
Given select Location
When Clcik summary button
Then summary page is display

Scenario: Load Prestart History
When click prestart History
Then prestart history is display

Scenario: Return to task
Given in summary page
When click return to task button
Then back to Mining task Page

Scenario: New Task
When click New Task Button
And click New Mining Task button
Then mining task form is clear

Scenario: Finalise and logout
Given navigate to summary
When click finalise Plod button
And click Finish
And click button logout
Then back to login page