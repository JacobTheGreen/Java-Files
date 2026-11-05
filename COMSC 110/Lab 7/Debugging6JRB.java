//***************************************************
//Debugging6JRB.java
//
//Author:Jacob Brosnan
//Date: 10-14-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Determines whether a string is a palindrome
//***************************************************

import java.util.Scanner;


public class Debugging6JRB {
   public static void main( String[] args ){
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      //prints out whether or not the given string is or is not a palindrome
      if ( isPalindrome( s ) ){
         System.out.println( s + " is a palindrome");
      }
      else{
         System.out.println( s + " is not a palindrome");
      }
   }//end of main method
   
   public static boolean isPalindrome( String s ){
      return s.equals( reverse( s ) );
   }//end of isPalindrome method
   
   public static String reverse( String s ) {
      String result = "";
      for (int i = 0; i < s.length(); i++) {
         result = s.charAt(i) + result;
      }
      return result;
   }//end of reverse method
  
}//end of class
