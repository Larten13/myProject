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
      List<WebElement> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getNavigationHelper().goToGroupsPage();
      List<WebElement> after = app.getGroupHelper().getGroupList();
      Assert.assertTrue(before.size() > after.size());
  }
}
