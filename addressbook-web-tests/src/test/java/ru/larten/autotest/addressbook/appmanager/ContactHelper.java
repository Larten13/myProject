package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.larten.autotest.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void createNewContact(ContactData contactData) {
        initAddNewContact();
        enterFirstname(contactData.getFirstname());
        enterMiddlename(contactData.getMiddlename());
        enterLastname(contactData.getLastname());
        enterNick(contactData.getNickname());
        enterCompanyName(contactData.getNameCompany());
        submitContact();
    }

    public void deleteContact() {
        selectContact();
        clickToDelete();
        submitBrowserAlert();
    }

    private void submitBrowserAlert() {
        driver.switchTo().alert().accept();
    }

    private void clickToDelete() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    private void submitContact() {
        click(By.name("submit"));
    }

    private void initAddNewContact() {
        click(By.linkText("add new"));
    }

    private void enterFirstname(String firstname) {
        enterField(By.name("firstname"), firstname);
    }

    private void enterMiddlename(String middlename) {
        enterField(By.name("middlename"), middlename);
    }

    private void enterLastname(String lastname) {
        enterField(By.name("lastname"), lastname);
    }

    private void enterNick(String nick) {
        enterField(By.name("nickname"), nick);
    }

    private void enterCompanyName(String nameCompany) {
        enterField(By.name("company"), nameCompany);
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}
