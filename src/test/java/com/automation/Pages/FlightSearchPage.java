package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Leaving from Button']")
    WebElement flyingFromInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Going to Button']")
    WebElement flyingToInput;

    @FindBy(xpath = "//android.view.View[@resource-id='TeamTypeaheadClearInputButton']")
    WebElement flyingFromTextInput;

    @FindBy(xpath = "//android.view.View[@resource-id='TeamTypeaheadClearInputButton']")
    WebElement flyingToTextInput;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/content']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
    WebElement fromInput;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/content']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
    WebElement toInput;


    public boolean isFlightSearchPageDisplayed() {
        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }

    public void enterFromLocation(String fromLocation) {
        flyingFromInput.click();
        flyingToTextInput.isDisplayed();
        flyingFromTextInput.sendKeys(fromLocation);
        fromInput.click();
    }

    public void enterToLocation(String toLocation) {
        flyingToInput.click();
        flyingToTextInput.sendKeys(toLocation);
        toInput.click();
    }
}
