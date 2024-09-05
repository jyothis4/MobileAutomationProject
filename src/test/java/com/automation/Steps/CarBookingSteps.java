package com.automation.Steps;

import com.automation.Pages.CarBookingPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CarBookingSteps {
    CarBookingPage carBookingPage=new CarBookingPage();
    @Then("user is on the car booking page")
    public void userIsOnTheCarBookingPage() {
        Assert.assertTrue(carBookingPage.verifyOnCarBookingPage().isDisplayed());
        ReportManager.attachScreenShot();
    }
}
