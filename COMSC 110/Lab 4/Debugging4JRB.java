//***************************************************
//Debugging4JRB.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-18-26
//Instructor: Dr. Gupta
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Demonstrate debugging skills in java
//***************************************************

import java.util.Scanner;


//This class computes the average of three numbers.
public class Debugging4JRB {
   public static void main( String[] args ){
      
      //asks for three inputs from the uer for 3 seperate varaibles
      Scanner input = new Scanner(System.in);
      System.out.println("Enter three integers: ");
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();
      
      
      //prints out the numbers and states which they are
      int i = 0;
      System.out.println("Number " + ++i + " is: " + number1);
      System.out.println("Number " + ++i + " is: " + number2);
      System.out.println("Number " + ++i + " is: " + number3);
      
      
      //adds the three numbers to a total
      double total;
      total = number1;
      total += number2;
      total += number3;
      
      //sets the denominator variable to 3 and prints out what the average of the three numbers is
      int denominator = 3;
      System.out.println("The average is: " + (total / denominator));
      
   }
}