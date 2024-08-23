package com.automation.Steps;

import com.automation.Pages.LoginPage;
import com.automation.Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @And("user enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        loginPage.enterUserEmail(ConfigReader.getConfigValue(email));
        loginPage.enterPassword(ConfigReader.getConfigValue(password));
    }

    @When("user click on login button")
    public void userClickOnLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }
}
