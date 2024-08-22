package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage=new HomePage();
    @Given("user opens the application")
    public void user_opens_the_application() {
        homePage.openApplication();
    }


    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on log in")
    public void userClickOnLogIn() {
        homePage.clickOnLogin();
    }

    @And("user click on continue with mail")
    public void userClickOnContinueWithMail() {
        homePage.clickOnContinueWithMail();
    }
}
