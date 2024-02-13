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
        enterField(By.name("group_name"), groupData.getName());
        enterField(By.name("group_header"), groupData.getHeader());
        enterField(By.name("group_footer"), groupData.getFooter());
        submitGroupCreation();
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
