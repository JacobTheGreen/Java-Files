//***************************************************
//Debugging3_Jacob_Brosnan.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-11-26
//Instructor: Dr. Gupta
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Determines whether a number is divisible by 2 or 3.
//***************************************************


/**
* This class determines whether a number is divisible by 2 or 3.
*/

import java.util.Scanner;

public class Debugging3_Jacob_Brosnan {
   public static void main(String[] args) {
   //Prompts for a positive interger
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int number = input.nextInt();
      
      //Checks if number is less than or equal to 0
      if (number <= 0){
         System.out.println("Input less than or equal to zero.");
      }
      
      //Displays whether or not it is divisible by 2 or 3
      else{
            System.out.println(number + " divisible by 2 or 3? " + ((number % 2 == 0) || (number % 3 == 0)));
            System.out.println(number + " divisible by 2 and 3? " + ((number % 2 == 0) && (number % 3 == 0)));
            System.out.println(number + " divisible by 2 or 3, but not both? " + ((number % 2 == 0) ^ (number % 3 == 0)));
      }
   }
}