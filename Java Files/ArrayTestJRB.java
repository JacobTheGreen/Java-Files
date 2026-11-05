//***************************************************
//ArrayTestJRB.java
//
//Author: Jacob Brosnan
//Date: 10-16-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to declare and use an array
//***************************************************

public class ArrayTestJRB{
   public static void main( String[] args ){
   int result = 0;
      //declare an array called myData to host a collection of your grades
      double[] myData = new double[5];//an array with the size of 5
      for( int index = 0; index < myData.length; index++ ){
         //myData[ myData.lenth - 1 ];//access the last element of the array
         myData[ index ] = index * 10.0;//goes through all elements in the index and sets it to 10.0
      }
      for( int index = 0; index < myData.length; index++ ){
         System.out.println( myData[index] );
      }
      
      //in-class exercise: add all array elements and print out the results
      for( int index = 0; index < myData.length; index++ ){
         result += myData[index];
      }
      System.out.println( result );
      
      double[][] myGrades = new double[ 4 ][ 5 ];
      
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            System.out.print( myGrades[ row ][ col ] + " " );
         }
         System.out.println();
      }
      
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            myGrades[row][col] = Math.floor( (Math.random() * 50) + 50 );
         }
      }
      
      
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            System.out.print( myGrades[ row ][ col ] + " " );
         }
         System.out.println();
      }
      
      
      //10-23-26
      //sum all elements of the 2D array
      double sum2D = 0.0;
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            sum2D += myGrades[ row ][ col ];
         }
      }
      System.out.println( "The sum of all 2D array elements is: " + sum2D );
      
      //sum all the rows and print the sum of each row
      double rowSum = 0.0;
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            rowSum += myGrades[ row ][ col ];
         }
         System.out.println( "The sum of row " + row + " is: " + rowSum );
         rowSum = 0.0;
      }
      
      //after-class exercise:
      //sum all the columns and print the sum of each column
      double colSum = 0.0;
      for(int col = 0; col < myGrades.length; col++ ){
         for( int row = 0; row < myGrades.length; row++){
            colSum += myGrades[ row ][ col ];
         }
         System.out.println( "The sum of col " + col + " is: " + colSum );
         colSum = 0.0;
      }
      
      //find the largest element of the 2D array
      double largest2D = myGrades[0][0];
      int largest2DRowIndex = 0;
      int largest2DColIndex = 0;
      for(int row = 0; row < myGrades.length; row++ ){
         for( int col = 0; col < myGrades[ row ].length; col++){
            if( largest2D < myGrades[ row ][ col ] ){
               largest2D = myGrades[ row ][ col ];
               largest2DRowIndex = row;
               largest2DColIndex = col;
            }
         }
         
      }
      
      System.out.println( "The largest element is: " + largest2D + " located at row: " + largest2DRowIndex + " col: " + largest2DColIndex );
      
      System.out.println("Pattern 1:");
      for( int row = 1; row <= 4; row++ ){
         for( int col = 1; col <= row; col++){
            System.out.print( "*" );
         }
         System.out.println();
      }
      
      
      System.out.println("Pattern 2:");
      for( int row = 4; row >= 1; row-- ){
         for( int col = row; col >= 1; col--){
            System.out.print( "*" );
         }
         System.out.println();
      }
      
      
      System.out.println("Pattern 4:");
      for( int row = 1; row <= 4; row++ ){
         for( int col = 1; col <= row; col++){
            System.out.print( "*" );
         }
         System.out.println();
      }
      
      
      
   }//end of main
   
}//end of class