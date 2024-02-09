package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroupTest() {
      app.goToPageGroups();
      app.selectGroups();
      app.deleteSelectedGroup();
      app.goToPageGroups();
  }
}
