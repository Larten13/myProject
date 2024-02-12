package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.larten.autotest.addressbook.model.GroupData;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewGroup(GroupData groupData) {
      driver.findElement(By.name("new")).click();
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
      driver.findElement(By.name("submit")).click();
    }

    public void selectGroups() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void deleteSelectedGroup() {
        driver.findElement(By.name("delete")).click();
    }
}
