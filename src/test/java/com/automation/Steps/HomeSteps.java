package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.openApplication();
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed());
    }

    @When("user click on flight tab")
    public void user_click_on_flight_tab() {
        homePage.clickOnFlightTab();
    }


    @Given("user opens the application")
    public void user_opens_the_application() {
        homePage.openApplication();
    }


    @When("user click on packages tab")
    public void userClickOnPackagesTab() {
        homePage.clickOnPackagesTab();
    }


    @When("user clicks on account")
    public void userClicksOnAccount() {
        homePage.clickOnAccount();
    }

    @When("user clicks on chat option")
    public void userClicksOnChatOption() {
        homePage.clickOnChat();
    }

    @When("user click on cruises tab")
    public void userClickOnCruisesTab() {
        homePage.clickOnCruises();
    }

    @When("user clicks on the car tab")
    public void userClicksOnTheCarTab() {
        homePage.clickOnCars();
    }

    @When("user click on things to do")
    public void userClickOnThingsToDo() {
        homePage.clickOnThingsToDo();
    }

    @When("user clicks on discover")
    public void userClicksOnDiscover() {
        homePage.clickOnDiscover();
    }

    @When("user clicks on the stays tab")
    public void userClicksOnTheStaysTab() {
        homePage.clickOnStays();
    }
}
