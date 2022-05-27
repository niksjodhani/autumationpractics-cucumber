package com.automationpractice.Steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.utility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignInSteps {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignIn();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() throws InterruptedException {
        new MyAccountPage().setEmail("xcv@gami.com");
        new MyAccountPage().setPassword("cucumber1");
        new MyAccountPage().clickOnSignButton();
        Thread.sleep(2000);

    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddressTab();
        new MyAccountPage().getAddressBoxText();
        Assert.assertTrue(new MyAccountPage().getAddressBoxText().contains("fgh hgf"),"Name not matched");
        Assert.assertTrue(new MyAccountPage().getAddressBoxText().contains("Alabama"),"State not matched");
        Assert.assertTrue(new MyAccountPage().getAddressBoxText().contains("047549392"),"Mob. num. not matched");

    }
}
