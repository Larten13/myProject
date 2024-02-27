package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.ContactData;

import java.util.List;

public class EditContactTest extends  TestBase {

    @Test
    public void editContactTest() {
        app.getNavigationHelper().goToHomePage();
        List<WebElement> before = app.getContactHelper().getContactList();
        if (!app.getContactHelper().isContactThere()) {
            app.getNavigationHelper().goToNewContactPage();
            app.getContactHelper().createNewContact(
                    new ContactData(
                            "firstname",
                            "middlename",
                            "lastname",
                            "larten",
                            "myCompany",
                            "test_group_modified"),
                    true);
            app.getNavigationHelper().goToHomePage();
            app.getNavigationHelper().goToEditContactPage();
        }
        app.getNavigationHelper().goToEditContactPage();
        app.getContactHelper().fillAllFieldsContact(
                new ContactData(
                        "firstnameModified",
                        "middlenameModified",
                        "lastnameModified",
                        "lartenModified",
                        "myCompanyModified",
                        null));
        app.getContactHelper().saveChanges();
        app.getNavigationHelper().goToHomePage();
        List<WebElement> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size(), after.size());
    }
}
