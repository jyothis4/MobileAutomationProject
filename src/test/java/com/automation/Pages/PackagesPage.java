package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagesPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/uds_toolbar_title']")
    WebElement packages;


    public WebElement verifyOnPackagePage() {
        return packages;
    }
}
