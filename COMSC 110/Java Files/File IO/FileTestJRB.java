//***************************************************
//FileTestJRB.java
//
//Author: Jacob Brosnan
//Date: 10-26-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to use methods from File class
//***************************************************



public class FileTestJRB{
   public static void main( String[] args ){
      //create an object from the File class, call the object file
      java.io.File file = new java.io.File( "hawk.jpg" );
      file.exists();//true
      System.out.println( "Does the file exist? " + file.exists() );//true
      System.out.println( file.canRead() );//true
      System.out.println( file.isDirectory() );//false
      System.out.println( file.isAbsolute() );//false
      System.out.println( file.lastModified() );//1793023988207
      System.out.println( new java.util.Date( file.lastModified() ) );//Mon Oct 26 10:13:08 EDT 2026
      
         
   }//end of main
   
}//end of class