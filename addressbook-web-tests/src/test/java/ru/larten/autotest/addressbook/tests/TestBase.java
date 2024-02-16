package ru.larten.autotest.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.Browser;
import ru.larten.autotest.addressbook.appmanager.ApplicationManager;


public class TestBase {
    protected final ApplicationManager app = new ApplicationManager(Browser.CHROME.browserName());

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
