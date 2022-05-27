package com.automationpractice.Steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SignupSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
    }

    @Then("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new HomePage().clickOnSignIn();
        new MyAccountPage().setCreateEmailField();
        new MyAccountPage().clickOnCreateAnAccount();
        new MyAccountPage().selectMrRadio();
        new MyAccountPage().setFirstnameField("iona");
        new MyAccountPage().setLastnameField("noa");
        new MyAccountPage().setPasswordField("cucumber1");
        new MyAccountPage().setAddress(Utility.getRandomString(10));
        new MyAccountPage().setCityField("London");
        new MyAccountPage().selectState("Colorado");
        new MyAccountPage().setZipCode("12309");
        new MyAccountPage().selectCountry("United States");
        new MyAccountPage().setMobileNum("0987654123");
        new MyAccountPage().setFutureReference(Utility.getRandomString(8));
        new MyAccountPage().clickOnRegisterButton();
        Assert.assertEquals("Account not created","MY ACCOUNT",new MyAccountPage().getMyAccountText());
    }
}
