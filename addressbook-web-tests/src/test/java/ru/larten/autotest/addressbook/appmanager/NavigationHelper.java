package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }
    public void goToPageGroups() {
      click(By.linkText("groups"));
    }

    public void goToPageNewContact() {
        click(By.linkText("add new"));
    }

    public void goToEditPage() {
        click(By.cssSelector("tr:nth-child(2) > td:nth-child(8) img"));
    }

    public void submitBrowserAlert() {
        driver.switchTo().alert().accept();
    }
}
