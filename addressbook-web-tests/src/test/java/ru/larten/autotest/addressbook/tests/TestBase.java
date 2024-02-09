package ru.larten.autotest.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import ru.larten.autotest.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
