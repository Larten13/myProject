package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class EditContactTest extends  TestBase {

    @Test
    public void editContactTest() {
        app.getNavigationHelper().goToHomePage();
        if (!app.getContactHelper().isContactThere()) {
            app.getNavigationHelper().goToPageNewContact();
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
    }
}
