package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.larten.autotest.addressbook.model.GroupData;

public class CreateGroupTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupsPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().goToGroupsPage();
    app.getGroupHelper().createNewGroup(
            new GroupData(
                    "test_group",
                    "test_group_header",
                    "test_group_footer"));
    app.getNavigationHelper().goToGroupsPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertTrue(after > before);
  }
}
