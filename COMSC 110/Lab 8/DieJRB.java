//***************************************************
//DieJRB.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Roll a six-sided die
//***************************************************

public class DieJRB{
   private int sideShowing;
   
   public int DieJRB(){
      int result;
      sideShowing = (int) ( Math.random() * 6 ) + 1;
      result = sideShowing;
      return result;
   }
   
   public void roll(){
      sideShowing = (int) ( Math.random() * 6 ) + 1;
   }
   
   public int getValue(){
      int result;
      result = sideShowing;
      return result;
   }
   
}//end of class