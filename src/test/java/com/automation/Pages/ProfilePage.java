package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")
    WebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@text='Display appearance']/parent::android.view.View/following-sibling::android.widget.Button")
    WebElement clickAppearances;

    @FindBy(xpath = "//android.widget.TextView[@text='Dark']/preceding-sibling::android.view.View")
    WebElement selectDark;

    @FindBy(xpath = "//android.widget.Button")
    WebElement themeDone;

    @FindBy(xpath = "//android.widget.TextView[@text='Display appearance']/following-sibling::android.widget.TextView")
    WebElement themeSelected;

    public WebElement verifyOnProfilePage() {
        return settings;
    }

    public void clickOnSettings() {
        settings.click();
    }

    public void clickDisplayAppearances() {
        clickAppearances.click();
    }

    public void clickDarkTheme() {
        selectDark.click();
    }

    public void clickThemeDone() {
        themeDone.click();
    }

    public boolean verifyThemeSelected() {
        return themeSelected.getText().contains("Dark");
    }
}
