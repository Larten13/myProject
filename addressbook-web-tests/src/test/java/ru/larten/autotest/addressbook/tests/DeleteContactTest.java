package ru.larten.autotest.addressbook.tests;

import org.junit.Test;


public class DeleteContactTest extends TestBase {

  @Test
  public void deleteContactTest() {
    app.getContactHelper().deleteContact();
  }
}