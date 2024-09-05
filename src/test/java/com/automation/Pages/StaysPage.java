package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaysPage extends BasePage {
    @FindBy(xpath = "//android.widget.TextView[@resource-id='TeamTypeaheadInputPlaceholder']")
    WebElement staysInput;


    public WebElement verifyOnStaysPage() {
        return staysInput;
    }
}
