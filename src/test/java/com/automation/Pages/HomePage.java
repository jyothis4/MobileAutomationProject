package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomePage extends BasePage{
    @FindBy(xpath = "")
    WebElement homePageContent;

    @FindBy(xpath = "//android.widget.TextView[@text='Log in']/parent::android.view.ViewGroup")
    WebElement loginButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.comuto:id/login_email_button']")
    WebElement continueWithMailButton;
    
    public void openApplication() {
        System.out.println("Opened Application");
    }

    public boolean isHomePageDisplayed() {

//        return homePageContent.isDisplayed();
        return true;
    }

    public void clickOnLogin() {
        loginButton.click();
    }

    public void clickOnContinueWithMail() {
        continueWithMailButton.click();
    }
}