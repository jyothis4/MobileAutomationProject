package com.automation.Steps;

import com.automation.Pages.StaysPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class StaysStep {
    StaysPage staysPage=new StaysPage();
    @Then("user is on the stays page")
    public void userIsOnTheStaysPage() {
        Assert.assertTrue(staysPage.verifyOnStaysPage().isDisplayed());
        ReportManager.attachScreenShot();
    }
}
