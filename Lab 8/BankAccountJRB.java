//***************************************************
//BankAccountJRB.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
//Purpose: This class represents a bank account
//***************************************************

import java.util.Date;


public class BankAccountJRB {
   private int id;
   private double balance;
   private static double annualInterestRate;
   private Date dateCreated;
   
   //Sets the dateCreated
   public BankAccountJRB() {
      dateCreated = new Date();
   }
   
   //Constructor.  Set id, balance, and dateCreated.
   public BankAccountJRB(int newId, double newBalance) {
      id = newId;
      balance = newBalance;
      dateCreated = new Date();
   }
   
   //Getter method for account id.
   public int getId() {
      return id;
   }
   
   //Getter method for account balance
   public double getBalance() {
      return balance;
   }
   
   //Getter method for interest rate
   public static double getAnnualInterestRate() {
      return annualInterestRate;
   }
   
   //Setter method for id
   public void setId(int id) {
      this.id = id;
   }
   
   //Setter method for balance
   public void setBalance(double balance) {
      balance = balance;
   }
   
   //Setter method for interest rate
   public static void setAnnualInterestRate(double newAnnualInterestRate) {
      annualInterestRate = newAnnualInterestRate;
   }
   
   //Compute and return montly interest from the balance and annual interest rate
   public double getMonthlyInterest() {
      return balance * (annualInterestRate / 1200);
   }
   
   //Getter method for dateCreated.
   public Date getDateCreated() {
      return dateCreated;
   }
   
   //Deduct specified amount from the balance
   public void withdraw(int amount) {
      balance -= amount;
   }
   
   //Add specified amount to the balance
   public void deposit(double amount) {
      balance += amount;
   }
   
   
}//end of class
