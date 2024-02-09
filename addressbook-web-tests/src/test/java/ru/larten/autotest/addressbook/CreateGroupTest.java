package ru.larten.autotest.addressbook;

import org.junit.Test;

public class CreateGroupTest extends TestBase {

  @Test
  public void testGroupCreation() {
    goToPageGroups();
    createNewGroup(new GroupData("test_group", "test_group_header", "test_group_footer"));
    goToPageGroups();
  }
}
