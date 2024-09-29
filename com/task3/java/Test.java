package com.task3.java;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Eskeldi", 'm');
        Account account = new Account(1001, customer, 500.00);

        System.out.println(account.toString());
        
        account.deposit(150);
        System.out.println(account.toString());

        account.withdraw(100);
        System.out.println(account.toString());

        account.withdraw(600); 
        System.out.println(account.toString());
    }
}