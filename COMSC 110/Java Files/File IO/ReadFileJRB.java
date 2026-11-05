//***************************************************
//ReadFileJRB.java
//
//Author: Jacob Brosnan
//Date: 10-26-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to write in a text file
//***************************************************

import java.util.Scanner;

public class ReadFileJRB{
   public static void main( String[] args ) throws java.io.IOException {
      //create a File object called readFile from the File class
      //link the object with "scores.txt"
      java.io.File readFile = new java.io.File("scores.txt");
      
      
      //create a Scanner object and link it with readFile
      Scanner input = new Scanner( readFile );
      while( input.hasNext() ){
         String fName = input.next();
         String lName = input.next();
         int score = input.nextInt();
         System.out.println( fName + " - " + lName + " - " + score );
      }
      
      
   }//end of main
   
}//end of class