$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/elank/Jenkins_Practice/src/test/resources/FeatureFile/Login_Basic.feature");
formatter.feature({
  "name": "To Validate the Login Functionality of the Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the Login Functionality as Invalid Username and valid Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to launch the Facebook application through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_launch_the_Facebook_application_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter the invalid username and valid  password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_the_invalid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_the_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});