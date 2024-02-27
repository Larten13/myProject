package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class EditContactTest extends  TestBase {

    @Test
    public void editContactTest() {
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getCountContact();
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
        int after = app.getContactHelper().getCountContact();
        Assert.assertEquals(before, after);
    }
}
