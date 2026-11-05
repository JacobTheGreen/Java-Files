//***************************************************
//Debugging5JRB.java
//
//Author:Jacob Brosnan
//Date: 10-7-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Simulates dealing cards
//***************************************************

import java.util.*;

/**
* This class repeatedly prompts the user for an integer and a new base
* and converts the decimal input into the new base.
*/

public class Debugging5JRB {
   public static void main(String[] args){
      //creates a new scanner
      Scanner input = new Scanner(System.in);
      
      //sets the answer variable to Y so the do while loop will run
      char answer = 'Y';
      
      do {
         //prompts the user for an interger that will be converted into a new base
         System.out.println("Enter an integer: ");
         int n = input.nextInt();
         
         //prompts the user for a new base to be used in the program
         System.out.println("Enter the new base: ");
         int base = input.nextInt();
         
         //declares and initializes the variables value and outputString
         String outputString = "";
         int value = n;
         
         //sets the outputString to the number in the new base
         while (value != 0.0 ){
            outputString = (value % base) + outputString;
            value = value / base;
         }
         
         //prints out the n variable that was entered by the user with the new base entered by the user and the number in that base
         System.out.println( n + " in base " + base + " is " + outputString);
         
         //prompts the user if they want to convert another number, and if y then it repeats if n or any other char then it exits the do while loop
         System.out.println("Would you like to convert another number?");
         answer = input.next().toUpperCase().charAt(0);
      }//end of do
      
      while( answer == 'Y' );
      
      

      
   }//end of method


}//end of class

