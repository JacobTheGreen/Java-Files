//***************************************************
//LoopTestJRB.java
//
//Author:Jacob Brosnan
//Date: 10-5-26
//Instructor: Dr. Bai
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Demo some library functions
//***************************************************

public class LoopTestJRB {
   public static void main( String[] args ){
      //declare two variables to hold twointeger values
      int num1 = 10;
      int num2 = 20;
      System.out.println("The sum from " + num1 + " to " + num2 + " is: " + summation( num1, num2 ) );//calling the method defined: actual parameters: num1, num2
      System.out.println("The sum from " + num1 + " to " + num2 + " is: " + summation( num1+3, num2+7 ) );
      
      
      
      
   }//end of main
   
   
   //write my own method
   public static int summation( int lBound, int uBound ){
      int sum = 0;
      for ( int index = lBound; index <= uBound ; index++){
         sum += index;
      }
      return sum;
   }//end of our own method
      //System.out.println("The sum from 1 to 10 is: " + sum );

}//end of class