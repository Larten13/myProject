package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterField(By.name("user"), username);
        enterField(By.name("pass"), password);
        click(By.cssSelector("input:nth-child(7)"));
    }

    public void setupSession(String ip, String port) {
        driver.get("http://" + ip + ":" + port + "/addressbook/");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
}
