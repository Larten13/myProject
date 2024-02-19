package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }
    public void goToPageGroups() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
      click(By.linkText("groups"));
    }

    public void goToPageNewContact() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                && isElementPresent(By.name("submit"))) {
            return;
        }
        click(By.linkText("add new"));
    }

    public void goToEditContactPage() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                && isElementPresent(By.name("update"))) {
            return;
        }
        click(By.cssSelector("tr:nth-child(2) > td:nth-child(8) img"));
    }

    public void submitBrowserAlert() {
        driver.switchTo().alert().accept();
    }
}
