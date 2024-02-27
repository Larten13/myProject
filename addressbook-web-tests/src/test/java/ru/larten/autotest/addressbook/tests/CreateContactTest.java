package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.ContactData;

import java.util.List;

public class CreateContactTest extends TestBase {

  @Test
  public void createContactTest() {
    app.getNavigationHelper().goToHomePage();
    List<WebElement> before = app.getContactHelper().getContactList();
    for (int i = 1; i <= 10; i++) {
      app.getNavigationHelper().goToNewContactPage();
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
    }
    app.getNavigationHelper().goToHomePage();
    List<WebElement> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size()+10);
  }
}
