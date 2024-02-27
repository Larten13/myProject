package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.larten.autotest.addressbook.model.ContactData;


public class DeleteContactTest extends TestBase {

  @Test
  public void deleteContactTest() {
    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getCountContact();
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
    app.getContactHelper().selectContact(before-1);
    app.getContactHelper().clickToDelete();
    app.getNavigationHelper().submitBrowserAlert();
    int after = app.getContactHelper().getCountContact();
    Assert.assertTrue(after < before);
  }
}
