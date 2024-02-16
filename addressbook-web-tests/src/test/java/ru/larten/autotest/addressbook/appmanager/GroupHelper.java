package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.larten.autotest.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void createNewGroup(GroupData groupData) {
        initGroupCreation();
        enterGroupName(groupData);
        enterGroupHeader(groupData);
        enterGroupFooter(groupData);
        submitGroupCreation();
    }

    public void modifyGroup(GroupData groupData) {
        selectGroups();
        editGroup();
        enterGroupName(groupData);
        enterGroupHeader(groupData);
        enterGroupFooter(groupData);
        submitEditGroup();
    }

    private void submitEditGroup() {
        click(By.name("update"));
    }

    private void enterGroupFooter(GroupData groupData) {
        enterField(By.name("group_footer"), groupData.getFooter());
    }

    private void enterGroupHeader(GroupData groupData) {
        enterField(By.name("group_header"), groupData.getHeader());
    }

    private void enterGroupName(GroupData groupData) {
        enterField(By.name("group_name"), groupData.getName());
    }

    private void editGroup() {
        click(By.name("edit"));
    }

    private void submitGroupCreation() {
        click(By.name("submit"));
    }

    private void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroups() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

}
