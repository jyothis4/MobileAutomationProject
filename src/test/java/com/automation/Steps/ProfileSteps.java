package com.automation.Steps;

import com.automation.Pages.ProfilePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProfileSteps {
    ProfilePage profilePage=new ProfilePage();
    @Then("verify user is on profile page")
    public void verifyUserIsOnProfilePage() {
        Assert.assertTrue(profilePage.verifyOnProfilePage().isDisplayed());
    }
}
