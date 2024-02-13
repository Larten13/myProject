package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterField(By.name("user"), username);
        enterField(By.name("pass"), password);
        click(By.cssSelector("input:nth-child(7)"));
    }

    public void setupSession(String ip) {
        driver.get("http://" + ip + "/addressbook/");
        driver.manage().window().setSize(new Dimension(974, 1040));
    }
}
