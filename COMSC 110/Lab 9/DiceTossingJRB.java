//***************************************************
//DiceTossingJRB.java
//
//Author: Jacob Brosnan
//Date: 10-23-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Rolls 2 dice 1,000 times and adds thhe sum of the 2 die to an array
//***************************************************




public class DiceTossingJRB {
    public static void main( String[] args ){
      //create two die objects
      DiceTossingJRB die1 = new DiceTossingJRB();//first die object
      DiceTossingJRB die2 = new DiceTossingJRB();//second die object
      
      int diceSums[]= new int[1000];
      
      
      
      for( int rollNum = 0; rollNum < diceSums.length; rollNum++ ){
         die1.roll();//rolls dice 1
         die2.roll();//rolls dice 2
         
         //sets the sum of both rolls to the corresponding spot in the diceSums array
         diceSums[ rollNum ] = die1.sum() + die2.sum();
      }
      
           
      
   }//end of main
   
   int sideShowing;
   
   //rolls the die
   public void roll(){
      sideShowing = (int) ( Math.random() * 6 ) + 1;
   }
   
   //gets the value of the die and returns it
   public int sum(){
      int result;
      result = sideShowing;
      return result;
   }
   
   
}//end of class