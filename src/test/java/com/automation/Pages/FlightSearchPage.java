package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(id = "com.expedia.bookings:id/udsFormFieldEditText")
    WebElement flyingFromInput;

    @FindBy(id = "com.expedia.bookings:id/udsFormFieldEditText")
    WebElement flyingToInput;


    public boolean isFlightSearchPageDisplayed() {

        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }

    public void enterFromLocation(String fromLocation) {
        flyingFromInput.click();
        flyingFromInput.sendKeys(fromLocation);
    }

    public void enterToLocation(String toLocation) {
        flyingToInput.click();
        flyingToInput.sendKeys(toLocation);
    }
}
