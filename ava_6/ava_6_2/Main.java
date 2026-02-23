package ava_6.ava_6_2;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank("Attijariwafa Bank");

        myBank.addCustomer("Abdelhay", 1000.00);
        myBank.addCustomer("Sara", 500.00);

        myBank.addCustomerTransaction("Abdelhay", 250.50);
        myBank.addCustomerTransaction("Abdelhay", -100.00);
        myBank.addCustomerTransaction("Sara", -50.25);

        System.out.println("--- Bank Statement Report ---");
        myBank.printStatement("Abdelhay");
        System.out.println();
        myBank.printStatement("Sara");

        if (!myBank.addCustomer("Abdelhay", 50.0)) {
            System.out.println("\nNote: Could not add Abdelhay again (Duplicate check working).");
        }
    }
}