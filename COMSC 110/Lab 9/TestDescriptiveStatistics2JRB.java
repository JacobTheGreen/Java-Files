//****************************************************************
//TestDescriptiveStatistics2JRB.java
//
//Author: Jacob Brosnan
//Date: 10-23-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
// Purpose: This class tests the DescriptiveStatistics class with a 2-D array.
//****************************************************************

import java.util.*;


/**
* This class reads a row or column number from the user 
* and prints descriptive statistics
**/
public class TestDescriptiveStatistics2JRB{
   public static void main(String[] args){
      double[][] array = {{3.4, 5.2, 7.8},
                          {2.3, 1.8, 9.3},
                          {5.6, 7.2, 5.0},
                          {8.3, 9.2, 0.3}};
       
      //Ask the user for the row or column number                    
      System.out.println("Compute statistics for a row or a column? (Enter r or c)");
      Scanner input = new Scanner(System.in);
      char c = input.next().charAt(0);
      System.out.println("Which row or column number? \n(Enter a value between 1 and 3 for column or between 1 and 4 for row.");
      int n = input.nextInt();
      
      /* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
      if (( c == 'r') && (n < array.length + 1)) 
      {
         System.out.println( "Descriptive Statistics" );
         System.out.println( "minimum: " + DescriptiveStatisticsJRB.min( c, array, (n - 1) ) );
         System.out.println( "maximum: " + DescriptiveStatisticsJRB.max( c, array, (n - 1) ) );
         System.out.println( "mean: " + DescriptiveStatisticsJRB.mean( c, array, (n - 1) ) );
         System.out.println( "standard deviation: " + DescriptiveStatisticsJRB.stdev( c, array, (n - 1) ) );
         
            
      } 
      else if (( c == 'c') && (n < array[0].length + 1))
      {
         
         System.out.println( "Descriptive Statistics" );
         System.out.println( "minimum: " + DescriptiveStatisticsJRB.min( c, array, (n - 1) ) );
         System.out.println( "maximum: " + DescriptiveStatisticsJRB.max( c, array, (n - 1) ) );
         System.out.println( "mean: " + DescriptiveStatisticsJRB.mean( c, array, (n - 1) ) );
         System.out.println( "standard deviation: " + DescriptiveStatisticsJRB.stdev( c, array, (n - 1) ) );
         
      } 
      else 
      {
         System.out.println("Input Error");
      }      
      
   }
   
}