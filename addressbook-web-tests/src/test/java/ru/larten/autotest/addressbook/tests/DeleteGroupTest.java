package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.larten.autotest.addressbook.model.GroupData;

public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroupTest() {
      app.getNavigationHelper().goToGroupsPage();
      if (!app.getGroupHelper().isThereGroup()) {
          app.getGroupHelper().createNewGroup(new GroupData(
                  "test_group",
                  "test_group_header",
                  "test_group_footer"));
          app.getNavigationHelper().goToGroupsPage();
      }
      int before = app.getGroupHelper().getGroupCount();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getNavigationHelper().goToGroupsPage();
      int after = app.getGroupHelper().getGroupCount();
      Assert.assertTrue(before > after);
  }
}
