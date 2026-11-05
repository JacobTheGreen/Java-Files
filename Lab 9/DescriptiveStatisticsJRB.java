//****************************************************************
//DescriptiveStatisticsJRB.java
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
public class DescriptiveStatisticsJRB{
   //double 1d min method
   public static double min(double[] array){
      double result = array[0];
      for( int i = 1; i < array.length; i++ ){
         if( array[i] < result ){
            result = array[i];
         }
      }
      return result;
   }
   
   //double 2d array min method
   public static double min(char t, double[][] array, int n){
      double result;
      if(t == 'r'){
         result = array[n][0];
         for( int i = 0; i < array[n].length; i++ ){
            if( array[n][i] < result ){
               result = array[n][i];
            }
         }
      }
      else{
         result = array[0][n];
         for( int i = 0; i < array.length; i++ ){
            if( array[i][n] < result ){
               result = array[i][n];
            }
         }
      }
      return result;
   }
   
   //double 1d array max method
   public static double max(double[] array){
      double result = array[0];
      for( int i = 1; i < array.length; i++ ){
         if( array[i] > result ){
            result = array[i];
         }
      }
      return result;
   }
   
   //double 2d array max method
   public static double max(char t, double[][] array, int n){
      double result;
      if( t == 'r' ){
         result = array[n][0];
         for( int i = 0; i < array[n].length; i++ ){
            if( array[n][i] > result ){
               result = array[n][i];
            }
         }
      }
      else{
         result = array[0][n];
         for( int i = 0; i < array.length; i++ ){
            if( array[i][n] > result ){
               result = array[i][n];
            }
         }
      }
      return result;
   }
   
   //double 1d array mean method
   public static double mean(double[] array){
      double result = array[0];
      for( int i = 1; i < array.length; i++ ){
         result += array[i];
      }
      result = result / array.length;
      return result;
   }
   //double 2d array mean method
   public static double mean(char t, double[][] array, int n){
      double result = 0.0;
      if( t == 'r' ){
         for( int i = 0; i < array[n].length; i++ ){
            result += array[n][i];
         }
         result = result / array[n].length;
      }
      else{
         for( int i = 0; i < array.length; i++ ){
            result += array[i][n];
         }
         result = result / array.length;
      }
      return result;
   }
   
   //double 1d array stdev method
   public static double stdev(double[] array){
      double result;
      
      double mean = array[0];
      for( int i = 1; i < array.length; i++ ){
         mean += array[i];
      }
      mean = mean / array.length;
      
      double r = 0.0;
      
      for( int i = 0; i < array.length; i++ ){
         r += Math.pow( ( array[i] - mean ), 2 );
      }
      
      result = Math.sqrt( r / array.length );
      
      return result;
   }
   //double 2d array stdev method
   public static double stdev(char t, double[][] array, int n ){
      double result;
      
      double mean = mean(t, array, n);
      
      double r = 0.0;
      
      if(t == 'r'){
         for( int i = 0; i < array[n].length; i++ ){
            r += Math.pow( ( array[n][i] - mean ), 2 );
         }
         result = Math.sqrt( r / array[n].length );
      }
      else{
         for( int i = 0; i < array.length; i++ ){
            r += Math.pow( ( array[i][n] - mean ), 2 );
         }
         result = Math.sqrt( r / array[0].length );
      }
      
      
      return result;
   }
}