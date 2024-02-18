package ru.larten.autotest.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.larten.autotest.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillAllFields(ContactData contactData, Boolean creation) {
        enterField(By.name("firstname"), contactData.getFirstname());
        enterField(By.name("middlename"), contactData.getMiddlename());
        enterField(By.name("lastname"), contactData.getLastname());
        enterField(By.name("nickname"), contactData.getNickname());
        enterField(By.name("company"), contactData.getNameCompany());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void saveChanges() {
        click(By.name("update"));
    }

    public void clickToDelete() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void submitContact() {
        click(By.name("submit"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}
