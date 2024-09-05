package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThingsToDoPage extends BasePage {
    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id='com.expedia.bookings:id/search_src_text']")
    WebElement destinationInput;

    public WebElement verifyOnThingsToDoPage() {
        return destinationInput;
    }
}
