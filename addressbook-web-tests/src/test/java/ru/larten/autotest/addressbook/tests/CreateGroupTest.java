package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.GroupData;

public class CreateGroupTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToPageGroups();
    app.getGroupHelper().createNewGroup(
            new GroupData(
                    "test_group",
                    "test_group_header",
                    "test_group_footer"));
    app.getNavigationHelper().goToPageGroups();
  }
}
