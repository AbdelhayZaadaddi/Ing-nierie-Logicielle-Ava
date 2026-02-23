package ava_6.ava_6_2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add customer only if they don't exist
    public boolean addCustomer(String customerName, double initialDeposit) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialDeposit));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(customerName)) {
                return c;
            }
        }
        return null;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            System.out.println("Statement for Customer: " + customer.getName());
            ArrayList<Double> transactions = customer.getTransactions();

            for (int i = 0; i < transactions.size(); i++) {
                // Unboxing: Double object is converted back to primitive double
                double amount = transactions.get(i);
                System.out.printf("Transaction [%d]: %+.2f%n", (i + 1), amount);
            }
        } else {
            System.out.println("Customer not found.");
        }
    }
}