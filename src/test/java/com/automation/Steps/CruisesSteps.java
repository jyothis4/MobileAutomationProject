package com.automation.Steps;

import com.automation.Pages.CruisesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CruisesSteps {
    CruisesPage cruisesPage=new CruisesPage();
    @Then("verify user is on cruises search page")
    public void verifyUserIsOnCruisesSearchPage() {
        Assert.assertTrue(cruisesPage.verifyOnCruisesPage().isDisplayed());
    }
}
