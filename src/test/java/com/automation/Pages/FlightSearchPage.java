package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Leaving from Button']")
    WebElement flyingFromInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Going to Button']")
    WebElement flyingToInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"TeamTypeaheadInput\"]")
    WebElement flyingFromTextInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"TeamTypeaheadInput\"]")
    WebElement flyingToTextInput;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Chicago (ORD - O'Hare Intl.)\"]/ancestor::android.view.View/following-sibling::android.widget.Button")
    WebElement fromInput;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/content']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
    WebElement toInput;


    public boolean isFlightSearchPageDisplayed() {
        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }

    public void enterFromLocation(String fromLocation) {
        flyingFromInput.click();
        flyingFromTextInput.isDisplayed();
        flyingFromTextInput.sendKeys(fromLocation);
        fromInput.click();
    }

    public void enterToLocation(String toLocation) {
        flyingToInput.click();
        flyingToTextInput.sendKeys(toLocation);
        toInput.click();
    }
}
