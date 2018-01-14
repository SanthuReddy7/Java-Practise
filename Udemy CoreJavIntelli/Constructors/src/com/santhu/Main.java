package com.santhu;

public class Main {

    public static void main(String[] args) {

        /*BankAccount account = new BankAccount();
        //CAN WRITE THIS WITH constructor with parameters
        account.setAccountNo(123456);
        System.out.println("account no "+account.getAccountNo());
        account.getAccountNo();
        account.setCustomerName("Santhu");
        account.setEmail("abc@gmail.com");
*//*
        BankAccount account = new BankAccount(*//*12345,0.0,"santhu","abc@gmail.com","123-987-6543"*//*);
       System.out.println("\n");
        System.out.println("*******ACCOUNT DETAILS*******");
        System.out.println("Account holder name :"+account.getCustomerName());
        System.out.println("Account no :"+account.getAccountNo());
        System.out.println("your balance :"+account.getBalance());

        System.out.println("Email address :"+account.getEmail());
        System.out.println("Phone no :"+account.getPhoneNo());
        account.deposit(100.00);
        account.withdrawl(50);
        account.deposit(1000);
        account.withdrawl(50);*/

        BankAccount s= new BankAccount("santhu",100.0,"abc@gmail.com");
        System.out.println(s.getName());
    }
}
