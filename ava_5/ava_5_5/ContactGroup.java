package ava_5.ava_5_5;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup {
    private String groupName;
    private List<Contact> contacts = new ArrayList<>();

    public ContactGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public String buildGroupReport() {
        StringBuilder report = new StringBuilder();
        report.append("Group Report: ").append(groupName).append("\n");
        report.append("--------------------------\n");
        for (Contact c : contacts) {
            report.append("- ").append(c.getContactSummary()).append("\n");
        }
        return report.toString();
    }
}
