package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.ContactData;

import java.util.List;


public class DeleteContactTest extends TestBase {

  @Test
  public void deleteContactTest() {
    app.getNavigationHelper().goToHomePage();
    List<WebElement> before = app.getContactHelper().getContactList();
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
    app.getContactHelper().selectContact(before.size()-2);
    app.getContactHelper().clickToDelete();
    app.getNavigationHelper().submitBrowserAlert();
    List<WebElement> after = app.getContactHelper().getContactList();
    Assert.assertTrue(after.size() < before.size());
  }
}
