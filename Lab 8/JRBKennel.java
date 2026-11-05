//***************************************************
//JRBKennel.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Call the JRBDog class that is defined
//***************************************************

public class JRBKennel{
   public static void main( String[] args ){
      //create an object from the class called JRBDog;
      
      JRBDog dog1 = new JRBDog();//constructor JRBDog()
      
      JRBDog dog2 = new JRBDog( "Clown", 5 );//overloaded constructor JRBDog( String n, int a )
      
      
      //prints out the name and age of both dogs
      System.out.println( dog1.toString() + " " + dog2.toString() );
      
      //sets dog1's name to Lulu and age to 4
      dog1.setName( "Lulu" );
      dog1.setAge( 4 );
      //prints out the new name and age of dog1
      System.out.println( dog1.toString() );
      
      //sets dog2's name to summer and age to 5
      dog2.setName( "summer" );
      dog2.setAge( 5 );
      //prints out dog2's new name and their age in human years
      System.out.println( dog2.getName() + " " + dog2.dogToPpleYrs() );
      
           
      
   }//end of main
   
}//end of class