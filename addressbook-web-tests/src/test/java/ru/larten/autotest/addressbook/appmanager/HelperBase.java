package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void enterField(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}
