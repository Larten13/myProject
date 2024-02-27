package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;


public class DeleteContactTest extends TestBase {

  @Test
  public void deleteContactTest() {
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isContactThere()) {
      app.getContactHelper().createNewContact(
              new ContactData(
                      "firstname",
                      "middlename",
                      "lastname",
                      "larten",
                      "myCompany",
                      "test_group"),
              true);
      app.getNavigationHelper().goToHomePage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().clickToDelete();
    app.getNavigationHelper().submitBrowserAlert();
  }
}
