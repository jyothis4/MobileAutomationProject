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
    
    public void openApplication() {
        System.out.println("Opened Application");
    }

    public boolean isHomePageDisplayed() {
        return homePageContent.isDisplayed();
    }

}