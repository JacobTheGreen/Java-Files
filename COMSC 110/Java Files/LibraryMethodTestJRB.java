//***************************************************
//LibraryMethodTestJRB.java
//
//Author:Jacob Brosnan
//Date: 9-28-26
//Instructor: Dr. Bai
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Demo some library functions
//***************************************************

import java.util.Scanner;


public class LibraryMethodTestJRB {
   public static void main( String[] args ){
   
      //1- Math class methods
      System.out.println(  Math.pow(3.0 , 2.0)  );//3.0^2.0 = 9.0
      System.out.println( Math.sin( 0 )   ); //0.0
      System.out.println( Math.cos( Math.PI / 2 ) ); //0.866
      System.out.println( Math.sqrt( 1024 ) ); //32.0
      System.out.println( Math.exp( 3.5 ) ); //33.115
      System.out.println( Math.ceil( 2.1 ) ); //3.0
      System.out.println( Math.ceil( 2.0 ) ); //2.0
      System.out.println( Math.ceil( -2.1 ) ); //-2.0
      System.out.println( Math.floor( 2.4 ) ); //2.0
      System.out.println( Math.floor( -2.0 ) ); //-2.0
      System.out.println( Math.floor( -2.1 ) ); //-3.0
      System.out.println( Math.max( 2 , 4 ) ); //4
      System.out.println( Math.min( 2.5, 4.6 ) ); //2.5
      //write a Math class method call to find out the min of 2.4, 5.6, 1.9
      System.out.println( Math.min( Math.min( 1.9, 2.4 ), 5.6 ) ); //1.9
      //write a Math class method cal to find out the max of 2.4, 5.6, 1.9
      System.out.println( Math.max( Math.max( 1.9, 2.4 ), 5.6 ) ); //5.6
      
      //random method
      System.out.println( Math.random() );//[0.0, 1.0)
      System.out.println( Math.random() * 10 ); //[0.0, 10.0)
      System.out.println( Math.random() * 10 + 5 ); //[5.0, 15.0)
      //Write a java statement to print out a random number in the range of [9.0, 21.0)
      System.out.println( Math.random() * 12 + 9 ); //[9.0, 21.0)
      
      //9-30-26 String class methods
      //create a variable called testString and assign today's date to it as a String
      String testString = "Wednesday";
      //charAt() method
      testString.charAt(0);//w
      testString.charAt(1);//e
      testString.length();//9
      testString.charAt( testString.length() - 1 );//y
      String testString1 ="September";
      testString.concat( testString1 );//WednesdaySeptember
      //SeptemberWednesday
      System.out.println( testString1.concat( testString ) );//SeptemberWednesday
      testString.toLowerCase();//wednesday
      testString.equals( testString1 );//false
      testString.compareTo( testString1 );//4
      testString.compareTo( testString );//0
      testString.contains( "Wed" );//true
      testString.substring( 0, 2 );//We
      testString.substring( 2 );//dnesday
      
      //escape sequence
      System.out.println( "Today is Wednesay" );//
      System.out.println( "Today\"s date is Wednesday." );//Today"s date is Wednesday.
      //\t, \n
      //Write one wjava print statement to print out a poem using escape sequence
      //Roses are red
      //    Violets are blue
      System.out.println( "Roses are red\n \tViolets are blue" );
      
      //in-class exercises:
      //1. Create a new String variable that carries your full name
      //2. call String mathod to extract your first name and last name, save them to seperate variables
      //3. call String method to print out the length of your first name
      //4. call String method to print out the last leter of your first name
      //5. call String method to see if the 3rd letter in your last name is part of your first name
      //6. call String mathod to compare your first name with your last name
      String name = "Jacob Brosnan";
      String first = name.substring(0 , 5);
      String last = name.substring(6, 13);
      System.out.println( first.length() );
      System.out.println( first.charAt( first.length() - 1 ) );
      System.out.println( first.contains( last.substring(2) ) );
      first.compareTo( last );
      
      
      
      
      //10-5-26
      //char data type: one of the 8 primitive data types
      char letter = 'A';
      char numChar = '4';
      System.out.println( letter + numChar );//117
      char letter1 = '\u0041';//A
      System.out.println( letter1 );
      char numChar1 = '\u0034';//4
      System.out.println( numChar1 );
      int numLetter = (int)letter;//65
      System.out.println( numLetter );
      System.out.println( '1' + '2' );
      
      
      
   }//end of main
   
}//end of class