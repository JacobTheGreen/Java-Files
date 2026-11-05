//***************************************************
//RollDiceJRB.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Call the DieJRB class and roll a dice
//***************************************************

public class RollDiceJRB{
   public static void main( String[] args ){
      //create an object from the class called DieJRB
      DieJRB die1 = new DieJRB();//first die object
      DieJRB die2 = new DieJRB();//second die object
      
      Scanner
      do{
         die1.roll();
         die2.roll();
      
         //prints out the name and age of both dogs
         System.out.println( "Die 1 had a value of: " + die1.getValue() + ". Die 2 had a value of: " + die2.getValue() + ". The sum of both rolls is: " + ( die1.getValue() + die2.getValue() ) );
         
      while( moreRolls = "y" )
      
           
      
   }//end of main
   
}//end of class