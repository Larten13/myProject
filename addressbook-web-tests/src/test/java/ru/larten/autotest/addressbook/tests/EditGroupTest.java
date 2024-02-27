package ru.larten.autotest.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.GroupData;

import java.util.List;

public class EditGroupTest extends TestBase{
    @Test
    public void editGroupTest() {
        app.getNavigationHelper().goToGroupsPage();
        List<WebElement> before = app.getGroupHelper().getGroupList();
        if (!app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createNewGroup(new GroupData(
                    "test_group",
                    "test_group_header",
                    "test_group_footer"));
            app.getNavigationHelper().goToGroupsPage();
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillAllFieldsGroup(
                new GroupData(
                        "test_group_modified",
                        "test_group_header_modified",
                        "test_group_footer_modified"));
        app.getGroupHelper().submitEditGroup();
        app.getNavigationHelper().goToGroupsPage();
        List<WebElement> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(before.size(), after.size());
    }
}
