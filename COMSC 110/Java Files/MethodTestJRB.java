//***************************************************
//MethodTestJRB.java
//
//Author:Jacob Brosnan
//Date: 10-9-26
//Instructor: Dr. Bai
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Demo some library functions
//***************************************************

import java.util.Scanner;


public class MethodTestJRB {
   public static void main( String[] args ){
      int num1 = 10;
      int num2 = 20;
      System.out.println("The sum from " + num1 + " to " + num2 + " is: " + summation( num1, num2 ) );//calling the method defined: actual parameters: num1, num2
      System.out.println("The sum from " + num1 + " to " + num2 + " is: " + summation( num1+3, num2+7 ) );
      
      //call the new method of printGrade
      double myScore = 99.0;
      printGrade( myScore );
      
      
      //call the overloaded version of the method summation
      System.out.println( "The sum from 10.0 to 20.0 is: " + summation( 10.0, 20.0 ) );
      System.out.println( "The sum from 10 to 20 is: " + summation( 10, 20, 15 ) );
      
   }//end of main
   
   
   public static int summation( int lBound, int uBound ){
      int sum = 0;
      for ( int index = lBound; index <= uBound ; index++){
         sum += index;
      }
      return sum;
   }//end of our own method
   
   
   
   
   
   //create our own 2nd method, void return type
   public static void printGrade( double score ){
      if( score >= 90.0 ){
         System.out.println("Your letter grade is A.");
      }
      else if( score >= 80.0 ){
         System.out.println("Your letter grade is B.");
      
      }
      else if( score >= 70.0 ){
         System.out.println("Your letter grade is C.");
      }
      else if( score >= 60.0 ){
         System.out.println("Your letter grade is D.");
      
      }
      else{
         System.out.println("Your letter grade is F.");
      }
   }//end of method printGrade
   
   
   
   //10-9-26 - method overloading: same method name but different method formal parameters
   //overloading 1 - change the data type
   public static double summation( double lBound, double uBound ){
      double sum = 0.0;
      for ( double index = lBound; index <= uBound ; index++ ){
         sum += index;
      }
      return sum;
   }//end of our own method
   
   
   //overloading 2 - change the number of formal parameters to include 3 parameters, with the extra one being part of the window called hBound
   public static int summation( int lBound, int uBound, int hBound){
      int sum = 0;
      
      if(uBound >= hBound){
         for ( int index = lBound; index <= uBound ; index++ ){
            sum += index;
         }
      }
      else{
         sum = 0;
      }
      return sum;
   }//end of our own method



}//end of class