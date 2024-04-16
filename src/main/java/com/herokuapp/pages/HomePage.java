package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public LinkList getJavaScriptAlerts() {
        click(javaScriptAlerts);
        return new LinkList(driver);
    }
    @FindBy(css = "[href='/windows']")
    WebElement windowsLink;

    public LinkList getWindowsPage() {
        click(windowsLink);
        return new LinkList(driver);
    }
}
