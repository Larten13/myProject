package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.GroupData;

import java.util.List;

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
      List<GroupData> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().selectGroup(before.size()-1);
      app.getGroupHelper().deleteSelectedGroup();
      app.getNavigationHelper().goToGroupsPage();
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertTrue(before.size() > after.size());

      before.remove(before.size() - 1);
      Assert.assertEquals(before, after);
  }
}
