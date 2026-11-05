//***************************************************
//GameCraps2JRB.java
//
//Author:Jacob Brosnan
//Date: 10-30-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Plays a game of craps for 20,000 times and print out the numbers rolled and their sums, and if you lost or won, and also how many games out of the 20,000 you won
//***************************************************

import java.util.Scanner;

public class GameCraps2JRB{   //header of the class
   public static void main(  String[] args ){
      GameCraps2JRB die1 = new GameCraps2JRB();//first die object
      GameCraps2JRB die2 = new GameCraps2JRB();//second die object
      int diceSums = 0;
      boolean cont = true;
      int n = 0;
      int prevSum = 0;
      int wins = 0;
      int numGames = 20000;
      
      
      for(int i = 0; i < numGames; i++ ){
         while( cont == true ){
            die1.roll();
            die2.roll();
            diceSums = die1.getValue() + die2.getValue();
         
            int result = getResult(diceSums, prevSum);
         
            System.out.println("You rolled " + die1.getValue() + " and " + die2.getValue() + " = " + diceSums + "\n" );
         
         
            if( result == 0){
               System.out.println( "You Lose! :)\n\n" );
               cont = false;
            }
            else if( result == 1){
               if(n == 1){
                  System.out.println( "You rolled another 7. Sorry, you Lose! :(" );
                  cont = false;
               }
               else{
                  System.out.println( "You win! :) \n\n" );
                  wins++;
                  cont = false;
               }
            
            }
            else if( result == 2){
               System.out.println( "Your rolled same number again. " + diceSums + " - You Win! :)" );
               wins++;
               cont = false;
            }
            else if( result == 3){
               n = 1;
            }
         
         
            prevSum = diceSums;
      
         
         
         }//end of while loop
         cont = true;//resets the while loop so it can run again
      }//end of for loop
      
      System.out.println("You had a total of " + wins + " number of wins out of " + numGames + " games");
        
   }//end of main

   public static int getResult( int sum, int prevSum ){
      int result = 0; //initializes and declares the variable result
      //sets the result variable to the appropriate string
      switch( sum ){
         case 2, 3, 12: result = 0; break;
         case 4, 5, 6, 8, 9, 10: if( sum == prevSum ){result = 2;} else{result = 3;} break;
         case 7, 11: result = 1; break;
      }//end of switch
      return result;
   }//end of getResult method
   
   
   
   
   int sideShowing;
   
   //rolls the die
   public void roll(){
      sideShowing = (int) ( Math.random() * 6 ) + 1;
   }//end of roll method
   
   //gets the value of the die and returns it
   public int getValue(){
      int result = sideShowing;
      return result;
   }
   
}//end of class