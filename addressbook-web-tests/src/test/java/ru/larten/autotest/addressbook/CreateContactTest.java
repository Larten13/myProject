package ru.larten.autotest.addressbook;

import org.junit.Test;

public class CreateContactTest extends TestBase {

  @Test
  public void createContactTest() {
    createNewContact(new ContactData("firstname", "middlename", "lastname", "larten", "1", "myCompany"));
  }
}
