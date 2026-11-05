//***************************************************
//VariablePracticeJRB.java
//
//Author:Jacob Brosnan
//Date: 9-4-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: The purpose is to practice with variables
//***************************************************


public class VariablePracticeJRB
{
   public static void main(String[] args)
   {
      // Do not edit the next three lines
      int x = 1;
      int y = 2;
      int z = 3;
      
      // Edit the following lines.   
      // Remember you may not use numbers
      // You may reorder the assignments, change or remove variables from the expressions, 
      // or change the arithmetic operators being used

      z = x + x;
      x = z + y + x;
      y = x - z;
      
      // Do not edit the next two lines
      System.out.println("Your answer: x = " + x + ", y = " + y + ", z = " + z );
      System.out.println("Goal: x = 5, y = 3, z = 2");

   }
}
