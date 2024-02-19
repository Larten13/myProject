package ru.larten.autotest.addressbook.tests;

import org.junit.Test;
import ru.larten.autotest.addressbook.model.GroupData;

public class EditGroupTest extends TestBase{
    @Test
    public void editGroupTest() {
        app.getNavigationHelper().goToPageGroups();
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillAllFieldsGroup(
                new GroupData(
                        "test_group_modified",
                        "test_group_header_modified",
                        "test_group_footer_modified"));
        app.getGroupHelper().submitEditGroup();
    }
}
