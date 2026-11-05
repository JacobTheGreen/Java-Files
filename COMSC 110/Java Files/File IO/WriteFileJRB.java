//***************************************************
//WriteFileJRB.java
//
//Author: Jacob Brosnan
//Date: 10-26-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to write in a text file
//***************************************************



public class WriteFileJRB{
   public static void main( String[] args ) throws java.io.IOException {
      //create a file object called myFile from the file class
      java.io.File myFile = new java.io.File( "scores.txt" );
      
      if( myFile.exists() ){
         System.out.println( "File already exists" );
         System.exit(1);
      }
      //create a file to write into
      java.io.PrintWriter myOutput = new java.io.PrintWriter( myFile );
      //write into the file
      myOutput.print( "Ed Sheeran " );
      myOutput.println( 95 );
      //close the file
      //in-class exercise: add your own record
      myOutput.print( "Jacob Brosnan " );
      myOutput.println( 100 );
      
      myOutput.close();
   }//end of main
   
}//end of class