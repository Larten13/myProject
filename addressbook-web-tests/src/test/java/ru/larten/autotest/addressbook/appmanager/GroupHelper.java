package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.larten.autotest.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

      public void fillAllFieldsGroup(GroupData groupData) {
        enterField(By.name("group_footer"), groupData.getFooter());
        enterField(By.name("group_header"), groupData.getHeader());
        enterField(By.name("group_name"), groupData.getName());
    }

    public void submitEditGroup() {
        click(By.name("update"));
    }

    public void editGroup() {
        click(By.name("edit"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroups() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

}
