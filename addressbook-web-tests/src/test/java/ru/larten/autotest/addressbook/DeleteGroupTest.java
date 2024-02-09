package ru.larten.autotest.addressbook;

import org.junit.Test;

public class DeleteGroupTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        goToPageGroups();
        selectGroup();
        selectGroups();
        goToPageGroups();
    }

}
