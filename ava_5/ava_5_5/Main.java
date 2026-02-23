package ava_5.ava_5_5;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(" Jane ", " Doe ");
        System.out.println("Account Name: '" + myAccount.getFullName() + "'");

        AddressBook workFriends = new AddressBook("Work Contacts");
        myAccount.addAddressBook(workFriends);

        Contact c1 = new Contact("Alice", "Smith", "alice@google.com");
        Contact c2 = new Contact("Bob", "Jones", "bob@yahoo.com");
        workFriends.addContact(c1);
        workFriends.addContact(c2);

        System.out.println(workFriends.getSummary());

        Contact found = workFriends.findByEmail("alice@google.com");
        if (found != null) {
            System.out.println("Found: " + found.getContactSummary());
        }

        myAccount.printAllContactDomains();

        ContactGroup devTeam = new ContactGroup("Development Team");
        devTeam.addContact(c1);
        devTeam.addContact(c2);
        System.out.println("\n" + devTeam.buildGroupReport());
    }
}