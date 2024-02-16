package ru.larten.autotest.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;

import java.util.Objects;

public class ApplicationManager {

    private final String browser;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private WebDriver driver;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (Objects.equals(browser, Browser.FIREFOX.browserName())) {
            driver = new FirefoxDriver();
        } else if (Objects.equals(browser, Browser.CHROME.browserName())) {
            driver = new ChromeDriver();
        } else if (Objects.equals(browser, Browser.IE.browserName())) {
            driver = new InternetExplorerDriver();
        }
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.setupSession("10.5.28.135", "8080");
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
