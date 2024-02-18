package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void enterField(By locator, String text) {
        click(locator);
        if (text != null) {
            String containedTest = driver.findElement(locator).getAttribute("value");
            if (!containedTest.equals(text)) {
                clearField(locator);
                driver.findElement(locator).sendKeys(text);
            }
        }
    }

    private void clearField(By locator) {
        driver.findElement(locator).clear();
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
