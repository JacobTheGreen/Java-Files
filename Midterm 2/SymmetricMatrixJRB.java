//***************************************************
//SymmetricMatrixJRB.java
//
//Author: Jacob Brosnan
//Date: 10-30-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
//Purpose: tests if a given array is symmetric
//***************************************************


public class SymmetricMatrixJRB {
   public static void main( String[] args ){
      //defines a 2d matrix
      int M[][] = {{1, 2, 3, 4},
                   {2, 8, 5, 6},
                   {3, 5, 9, 7},
                   {4, 6, 7, 0}};
      //prints out whether or not the M matrix is symmetric
      System.out.println("Is the matrix symmetric? " + isSymmetric( M )  );
      
      
   }//end of main
   
   //determines whether or not the matrix inputted is symmetric or not
   public static boolean isSymmetric( int M[][] ){
      boolean result = true;
      for( int row = 0; row < M.length; row++ ){
         for( int col = 0; col < M[row].length; col++ ){
            if( M[row][col] != M[col][row] || result == false ){
               result = false;
            }
            else{
               result = true;
            }
         }
      }
      return result;
   }
   
}//end of class