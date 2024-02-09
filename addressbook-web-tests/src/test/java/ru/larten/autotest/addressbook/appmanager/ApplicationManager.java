package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.larten.autotest.addressbook.model.ContactData;
import ru.larten.autotest.addressbook.model.GroupData;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {

    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;
    private String ip;

    public void init() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        ip = "10.5.28.135";
        driver.get("http://" + ip + "/addressbook/");
        driver.manage().window().setSize(new Dimension(974, 1040));
        login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
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

    public void createNewContact(ContactData contactData) {
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).sendKeys(contactData.getTitle());
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys(contactData.getNameCompany());
    }

    public void goToPageGroups() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void selectGroups() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void deleteSelectedGroup() {
        driver.findElement(By.name("delete")).click();
    }
}
