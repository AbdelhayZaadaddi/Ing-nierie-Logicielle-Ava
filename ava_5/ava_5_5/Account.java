package ava_5.ava_5_5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String firstName;
    private String lastName;
    private List<AddressBook> addressBooks = new ArrayList<>();

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AddressBook[] getAddressBooks() {
        return addressBooks.toArray(new AddressBook[0]);
    }

    public void addAddressBook(AddressBook book) {
        addressBooks.add(book);
    }

    public String getFullName() {
        return (firstName + " " + lastName).trim();
    }

    public void printAllContactDomains() {
        System.out.println("Domains for " + getFullName() + ":");
        for (AddressBook book : addressBooks) {
            for (Contact contact : book.getContacts()) {
                System.out.println(" - " + contact.getEmailDomain());
            }
        }
    }
}