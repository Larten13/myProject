package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class CreateContactTest extends TestBase {

  @Test
  public void createContactTest() {
    app.getContactHelper().createNewContact(
            new ContactData(
                    "firstname",
                    "middlename",
                    "lastname",
                    "larten",
                    "1",
                    "myCompany"));
  }
}
