package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.larten.autotest.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void createNewGroup(GroupData groupData) {
        initGroupCreation();
        fillAllFieldsGroup(groupData);
        submitGroupCreation();
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

    public void selectGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

    public boolean isThereGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String name = element.getText();
            GroupData group = new GroupData(name, null, null);
            groups.add(group);
        }
        return groups;
    }
}
