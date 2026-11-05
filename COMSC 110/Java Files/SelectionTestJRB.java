//***************************************************
//SelectionTestJRB.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-11-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Demo the selection structures in java
//***************************************************

import java.util.Scanner;

public class SelectionTestJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //declare a variable to represent your age
      int age;
      //allow you to input your age from the keyboard
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter your age: ");
      age = scan.nextInt();
      
      
      
      if( age >=  21 ){
         System.out.println("You are ready. Congrats!");
      }
      else{
         System.out.println("Come another day!!!");
      }//end of if-else
      
      //demo how to use switch stmt
      //declare an interger variable to represent your birthyear
      int year = 2007;
      
      switch ( year % 12 ){
         case 0: System.out.println("Your zodiac animal is Monkey");break;
         case 1: System.out.println("Your zodiac animal is Rooster");break;
         case 2: System.out.println("Your zodiac animal is Dog");break;
         case 3: System.out.println("Your zodiac animal is Pig");break;
         case 4: System.out.println("Your zodiac animal is Rat");break;
         case 5: System.out.println("Your zodiac animal is Ox");break;
         case 6: System.out.println("Your zodiac animal is Tiger");break;
         case 7: System.out.println("Your zodiac animal is Rabbit");break;
         case 8: System.out.println("Your zodiac animal is Dragon");break;
         case 9: System.out.println("Your zodiac animal is Snake");break;
         case 10: System.out.println("Your zodiac animal is Horse");break;
         case 11: System.out.println("Your zodiac animal is Sheep");break;
         default : System.out.println("Try again, use a valid year!");
      
      
      }//end of switch
      
   }//end of main


}//end of class