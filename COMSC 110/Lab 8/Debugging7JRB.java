//***************************************************
//Debugging7JRB.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
//Purpose: This class tests the BankAccountJRB class.
//***************************************************

public class Debugging7JRB {
   public static void main( String[] args){
      //sets the interest rate to 1.5
      BankAccountJRB.setAnnualInterestRate(1.5);
      
      //declares and initializes all three bank accounts
      BankAccountJRB account1 = new BankAccountJRB(1, 500);
      BankAccountJRB account2 = new BankAccountJRB(2, 0);
      BankAccountJRB account3 = new BankAccountJRB(3, 900);
      
      //withdraws 500 from account1
      account1.withdraw(500);
      //deposits 3000 to account2
      account2.deposit(3000);
      //deposits 100 to account3
      account3.deposit(100);
      
      //prints out the account ID, the balance, the monthly interest, and the date it was created
      System.out.println("Account " + account1.getId() + " Balance is " + account1.getBalance() );
      System.out.println("Monthly interest is " + account1.getMonthlyInterest() );
      System.out.println("This account was created at " + account1.getDateCreated() );
      
      //prints out the account ID, the balance, the monthly interest, and the date it was created
      System.out.println("Account " + account2.getId() + " Balance is " + account2.getBalance() );
      System.out.println("Monthly interest is " + account2.getMonthlyInterest() );
      System.out.println("This account was created at " + account2.getDateCreated() );
      
      //prints out the account ID, the balance, the monthly interest, and the date it was created
      System.out.println("Account " + account3.getId() + " Balance is " + account3.getBalance() );
      System.out.println("Monthly interest is " + account3.getMonthlyInterest() );
      System.out.println("This account was created at " + account3.getDateCreated() );
   }
}

