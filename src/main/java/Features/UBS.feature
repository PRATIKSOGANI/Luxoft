Feature: UBS Website Features

Scenario: User is on UBS HomePage
Given User navigates to UBS website
When Title of the page is valid
Then User is on UBS HomePage

Scenario: Click on Contact Button and select Contact Us Button and verify page title

Given User Clicks on Contact button to select Contact Us OPtion
When Title of the Contact page is valid
Then I am on Contact Page

Scenario: Click on UBS Logins and Select US Client Acc Login Option and verify Page Title
Given User clicks on UBS Logins and Select US Client Acc Login Option
When Title of the Login page is valid
Then I am on Login Page
Then I enter "User" and "paswd"
Then I click on SignIn button
Then I verify message
And I close the browser


