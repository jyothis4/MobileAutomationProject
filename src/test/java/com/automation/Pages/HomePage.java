package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "")
    WebElement homePageContent;

    @FindBy(xpath = "//android.widget.TextView[@text='Log in']/parent::android.view.ViewGroup")
    WebElement loginButton;

    @FindBy(xpath = "//android.view.View[@resource-id='PreSignInDismissIcon']/android.widget.Button")
    WebElement closeButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")
    WebElement doNotAcceptBtn;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement getStartedBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/content']/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement closeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[2]/android.widget.Button")
    WebElement flightsTab;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.airbnb.android:id/search_component_1']")
    WebElement searchTab;

    @FindBy(xpath = "//android.view.View[@content-desc='Search input']/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View")
    WebElement destination;



    public void openApplication() {
        if (isPresent(closeButton)) {
            closeButton.click();
        }
        if (isPresent(doNotAcceptBtn)) {
            doNotAcceptBtn.click();
        }
        if (isPresent(closeBtn)) {
            closeBtn.click();
        }

    }

    public boolean isHomeScreenDisplayed() {
        return isPresent(flightsTab);
    }

    public void clickOnSearchTab() {
        searchTab.click();
        destination.click();
        System.out.println(driver.getPageSource());

    }

    public boolean isHomePageDisplayed() {

//        return homePageContent.isDisplayed();
        return true;
    }

    public void clickOnLogin() {
        loginButton.click();
    }


    public void clickOnContinueWithMail() {
    }

    public void clickOnFlightTab() {
        flightsTab.click();
    }
}