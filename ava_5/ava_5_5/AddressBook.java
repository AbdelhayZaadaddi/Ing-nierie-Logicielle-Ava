package ava_5.ava_5_5;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String name;
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public Contact[] getContacts() {
        return contacts.toArray(new Contact[0]);
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public String getSummary() {
        return "Address Book: " + name + " | Total Contacts: " + contacts.size();
    }

    public Contact findByEmail(String email) {
        for (Contact c : contacts) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                return c;
            }
        }
        return null;
    }
}
