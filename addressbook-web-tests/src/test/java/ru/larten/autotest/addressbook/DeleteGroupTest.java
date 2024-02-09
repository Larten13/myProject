package ru.larten.autotest.addressbook;

import org.junit.Test;
public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroupTest() {
      goToPageGroups();
      selectGroups();
      deleteSelectedGroup();
      goToPageGroups();
  }
}
