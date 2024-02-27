package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;

public class CreateContactTest extends TestBase {

  @Test
  public void createContactTest() {
    app.getNavigationHelper().goToPageNewContact();
    for (int i = 1; i <= 10; i++) {
      String num = Integer.toString(i);
      app.getContactHelper().createNewContact(
              new ContactData(
                      "firstname"+num,
                      "middlename"+num,
                      "lastname"+num,
                      "larten"+num,
                      "myCompany"+num,
                      "test_group_modified"),
              true);
      app.getContactHelper().submitContact();
      app.getNavigationHelper().goToPageNewContact();
    }
  }
}
