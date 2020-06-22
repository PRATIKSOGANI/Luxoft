$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UBS.feature");
formatter.feature({
  "line": 1,
  "name": "UBS Website Features",
  "description": "",
  "id": "ubs-website-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User is on UBS HomePage",
  "description": "",
  "id": "ubs-website-features;user-is-on-ubs-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to UBS website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the page is valid",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is on UBS HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "UBSstepDefinition.user_navigates_to_UBSHomePage()"
});
formatter.result({
  "duration": 16081165200,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.title_of_webpage_is_valid()"
});
formatter.result({
  "duration": 72617300,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.user_on_HomePage()"
});
formatter.result({
  "duration": 119800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Click on Contact Button and select Contact Us Button and verify page title",
  "description": "",
  "id": "ubs-website-features;click-on-contact-button-and-select-contact-us-button-and-verify-page-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User Clicks on Contact button to select Contact Us OPtion",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Title of the Contact page is valid",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am on Contact Page",
  "keyword": "Then "
});
formatter.match({
  "location": "UBSstepDefinition.user_clicks_ContactUs()"
});
formatter.result({
  "duration": 3335384800,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.title_of_contact_page()"
});
formatter.result({
  "duration": 13014500,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.On_contact_page()"
});
formatter.result({
  "duration": 77300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Click on UBS Logins and Select US Client Acc Login Option and verify Page Title",
  "description": "",
  "id": "ubs-website-features;click-on-ubs-logins-and-select-us-client-acc-login-option-and-verify-page-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User clicks on UBS Logins and Select US Client Acc Login Option",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Title of the Login page is valid",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I am on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter \"User\" and \"paswd\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I verify message",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "UBSstepDefinition.user_clicks_USclientLoginOptions()"
});
formatter.result({
  "duration": 8225254800,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.title_of_Login_page()"
});
formatter.result({
  "duration": 9590300,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.On_Login_page()"
});
formatter.result({
  "duration": 89400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User",
      "offset": 9
    },
    {
      "val": "paswd",
      "offset": 20
    }
  ],
  "location": "UBSstepDefinition.enter_usrnm_pswd(String,String)"
});
formatter.result({
  "duration": 382778400,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.click_signin()"
});
formatter.result({
  "duration": 147683300,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.verify_error()"
});
formatter.result({
  "duration": 916455500,
  "status": "passed"
});
formatter.match({
  "location": "UBSstepDefinition.quit()"
});
formatter.result({
  "duration": 443669800,
  "status": "passed"
});
});