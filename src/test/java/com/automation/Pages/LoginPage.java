package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{
//    @FindBy(className = "")
//    WebElement loginPageImage;

    @FindBy(className = "//android.widget.EditText[@text='Email']")
    WebElement emailInput;

    @FindBy(className = "//android.widget.EditText[@text='Password']")
    WebElement passwordInput;

    @FindBy(className = "//android.view.ViewGroup[@resource-id='com.comuto:id/button_layout']")
    WebElement loginButton;

    public boolean isLoginPageDisplayed() {
        return emailInput.isDisplayed();
    }

    public void enterUserEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
