package ru.larten.autotest.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String nameCompany;
    private final String group;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String nameCompany, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.nameCompany = nameCompany;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getGroup() {
        return group;
    }
}
