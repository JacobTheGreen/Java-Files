//***************************************************
//PasswordCheckerJRB.java
//
//Author:Jacob Brosnan
//Date: 10-14-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Determines whether or not a password meets the requirements
//***************************************************

import java.util.Scanner;

public class PasswordCheckerJRB{   //header of the class
   public static void main(  String[] args ){
      Scanner input = new Scanner( System.in );//declares the scanner input that is used
      
      //prompts the user for a password
      System.out.print("Enter a password: ");
      String password = input.next();
      
      //calls the passwordChecker method and if it returns true it prints "Valid Password" or "Invalid Password" if it returns false
      if( passwordChecker( password ) ){
         System.out.println("Valid Password");
      }
      else {
         System.out.println("Invalid Password");
      }
      
      
   }//end of main
   
   
   public static boolean passwordChecker( String password ){
      boolean result = true; //declares the result boolean and sets it to true
      int numOfDigits = 0; //declares and sets the number of digits to 0
      int numOfLowerCase = 0; //declares and sets the number of lowercase letters to 0
      int numOfUpperCase = 0; //declares and sets the number oof upper case letters to 0
      char c; //initializes the c variable
      
      //checks the length of the password and prints if it is too short and sets result to false if it is too short
      if( password.length() < 8 ){
         System.out.println("Your password is too short");
         result = false;
      }
      
      //checks through every char in the password and adds it to a counter of the number of digits if the char is a digit
      for( int i = 0; i < password.length(); i++){
         c = password.charAt(i);
         if( Character.isDigit(c) ){
            numOfDigits++;
         }
      }
      //if the number of digits in the password is less than two it prints that it has too few digits and sets result to false
      if( numOfDigits < 2 ){
         System.out.println("Your password has too few digits");
         result = false;
      }
      
      
      //checks through every char in the password and adds to a counter of the number of upper or lower case chars that arer in the password
      for( int i = 0; i < password.length(); i++){
         c = password.charAt(i);
         if( Character.isLowerCase(c) ){
            numOfLowerCase++;
         }
         if( Character.isUpperCase(c) ){
            numOfUpperCase++;
         }
      }
      //if the number of upper or lower case letters in the password is less than 1 it prints that it has too few upper or lower case letters and sets result to false
      if( numOfLowerCase < 1 || numOfUpperCase < 1 ){
         System.out.println("Your password has too few lower case or upper case letters");
         result = false;
      }
      
      //returns the result boolean to be used in the if else statement in the main method
      return result;
      
   }//end of passwordChecker method
   
   
}//end of class