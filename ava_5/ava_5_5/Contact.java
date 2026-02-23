package ava_5.ava_5_5;

public class Contact {
    private String firstName;
    private String lastName;
    private String email;

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailDomain() {
        if (email == null || !email.contains("@"))
            return "";
        return email.substring(email.indexOf("@") + 1);
    }

    public String getContactSummary() {
        return String.format("%s %s (%s)", firstName, lastName, email);
    }
}
