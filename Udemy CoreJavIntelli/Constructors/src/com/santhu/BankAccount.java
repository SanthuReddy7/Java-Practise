package com.santhu;


public class BankAccount {
    /*//Main class account
private int accountNo;
private double balance;
private String customerName;
private String email;
private String phoneNo;

    public BankAccount() {
        this(56789,2.5,"DefaultName","DefaultEmail","DefaultphoneNo");


        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNo, double balance, String customerName, String email, String phoneNo) {
        System.out.println("constructor with parameters");
        this.accountNo = accountNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void deposit(double depositAmount){
    this.balance += depositAmount;
    System.out.println("Deposit of "+depositAmount+" is made. New Balance is "+this.balance);
}
public void withdrawl(double withdrawlAmount){
    if(this.balance-withdrawlAmount<=0){
        System.out.println("only "+this.balance+"available. Withdrawl not processed");
    }else if(withdrawlAmount<=10){
        System.out.println("Withdrawl amount must be greater than 10");
    }else if(withdrawlAmount%2 !=0){
     System.out.println("please enter multiples of 10 ");
    }else {
       this.balance -= withdrawlAmount;
        System.out.println("withdrawl of "+withdrawlAmount+ "is processed. remaining balance is "+balance);
    }
}

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }*/

    private String name;
    private double creditlimit;
    private String email;

    public BankAccount(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public BankAccount() {
        System.out.println("default constructor");

    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
