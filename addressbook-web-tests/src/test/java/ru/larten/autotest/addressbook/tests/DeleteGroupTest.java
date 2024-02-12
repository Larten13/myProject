package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroupTest() {
      app.getNavigationHelper().goToPageGroups();
      app.getGroupHelper().selectGroups();
      app.getGroupHelper().deleteSelectedGroup();
      app.getNavigationHelper().goToPageGroups();
  }
}
