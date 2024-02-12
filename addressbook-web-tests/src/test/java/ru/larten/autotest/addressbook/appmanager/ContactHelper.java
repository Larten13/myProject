package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.larten.autotest.addressbook.model.ContactData;

public class ContactHelper {
    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewContact(ContactData contactData) {
        clickToAddNewContact();
        enterFirstname(contactData.getFirstname());
        enterMiddlename(contactData.getMiddlename());
        enterLastname(contactData.getLastname());
        enterNick(contactData.getNickname());
        enterCompanyName(contactData.getNameCompany());
    }

    private void clickToAddNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    private void enterFirstname(String firstname) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
    }

    private void enterMiddlename(String middlename) {
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys(middlename);
    }

    private void enterLastname(String lastname) {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(lastname);
    }

    private void enterNick(String nick) {
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys(nick);
    }

    private void enterCompanyName(String nameCompany) {
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys(nameCompany);
    }
}
