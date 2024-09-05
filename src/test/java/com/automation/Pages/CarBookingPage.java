package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBookingPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/uds_toolbar_title']")
    WebElement carBooking;


    public WebElement verifyOnCarBookingPage() {
        return carBooking;
    }
}
