$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshoping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15634507900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "TC-001 Create New User/SignUp",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-001-create-new-user/signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to SignUp page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "create an account with random username",
  "keyword": "Then "
});
formatter.match({
  "location": "SignupSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 92564700,
  "status": "passed"
});
formatter.match({
  "location": "SignupSteps.navigateToSignUpPage()"
});
formatter.result({
  "duration": 15500,
  "status": "passed"
});
formatter.match({
  "location": "SignupSteps.createAnAccountWithRandomUsername()"
});
formatter.result({
  "duration": 25000,
  "status": "passed"
});
formatter.after({
  "duration": 693549699,
  "status": "passed"
});
});