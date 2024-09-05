package com.automation.Steps;

import com.automation.Pages.ThingsToDoPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ThingsToDoSteps {
    ThingsToDoPage thingsToDoPage=new ThingsToDoPage();

    @Then("verify user is on search page")
    public void verifyUserIsOnSearchPage() {
        Assert.assertTrue(thingsToDoPage.verifyOnThingsToDoPage().isDisplayed());
        ReportManager.attachScreenShot();
    }
}
