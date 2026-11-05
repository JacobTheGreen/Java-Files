//****************************************************************
//TestDescriptiveStatisticsJRB.java
//
//Author: Jacob Brosnan
//Date: 10-23-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
// Purpose: This class tests the DescriptiveStatistics class with a 2-D array.
//****************************************************************

import java.util.Scanner;


/**
* This class reads a row or column number from the user 
* and prints descriptive statistics
**/
public class TestDescriptiveStatisticsJRB{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      
      //Ask the user for the row or column number                    
      System.out.println("How many numbers?");
      int r = input.nextInt();
      double array[] = new double[r];
      
      
      System.out.println( r + " numbers are:");
      double n;
      for( int i = 0; i < r; i++ ){
         n = input.nextDouble();
         array[i] = n;
      }
      
      System.out.println( "Descriptive Statistics" );
      System.out.println( "minimum: " + DescriptiveStatisticsJRB.min( array ) );
      System.out.println( "maximum: " + DescriptiveStatisticsJRB.max( array ) );
      System.out.println( "mean: " + DescriptiveStatisticsJRB.mean( array ) );
      System.out.println( "standard deviation: " + DescriptiveStatisticsJRB.stdev( array ) );
      
      
      
            
   }
   
}