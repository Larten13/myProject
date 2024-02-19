package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class EditContactTest extends  TestBase {

    @Test
    public void editContactTest() {
        app.getNavigationHelper().goToEditContactPage();
            app.getContactHelper().fillAllFieldsContact(
                    new ContactData(
                            "firstnameModified",
                            "middlenameModified",
                            "lastnameModified",
                            "lartenModified",
                            "myCompanyModified",
                            null),
                    false);
            app.getContactHelper().saveChanges();
    }
}
