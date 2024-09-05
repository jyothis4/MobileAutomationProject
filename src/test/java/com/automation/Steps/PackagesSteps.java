package com.automation.Steps;

import com.automation.Pages.PackagesPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class PackagesSteps {
    PackagesPage packagesPage=new PackagesPage();

    @Then("verify user is on packages search page")
    public void verifyUserIsOnPackagesSearchPage() {
        assertTrue(packagesPage.verifyOnPackagePage().isDisplayed());
        ReportManager.attachScreenShot();
    }

}
