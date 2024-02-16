package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class EditContactTest extends  TestBase {

    @Test
    public void editContactTest() {
            app.getContactHelper().modifyContact(
                    new ContactData(
                            "firstnameModified",
                            "middlenameModified",
                            "lastnameModified",
                            "lartenModified",
                            "myCompanyModified"));
    }
}
