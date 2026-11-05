//***************************************************
//RockPaperScissorsJRB.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-18-26
//Instructor: Dr. Gupta
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Allows the user to play rock papers scissors with the computer
//***************************************************

import java.util.Scanner;

public class RockPaperScissorsJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //allows an input from the user for the hand theyd like to play
      Scanner input = new Scanner( System.in );
      System.out.println("What would you like to play (0(Scissors), 1(Rock), 2(Paper)): ");
      int usrInput = input.nextInt();
      
      
      //Sets the cmptrInput variable to a random number
      double cmptrInput = Math.random() * 3;
      
      //Determines who wins the game of rock papers scissors
      switch(usrInput){
         case 0: System.out.println((usrInput == cmptrInput)? "Draw": (usrInput + 1 == cmptrInput)? "You lost!": "You win!"); break;
         case 1: System.out.println((usrInput == cmptrInput)? "Draw": (usrInput + 1 == cmptrInput)? "You lost!": "You win!"); break;
         case 2: System.out.println((usrInput == cmptrInput)? "Draw": (usrInput - 2 == cmptrInput)? "You lost!": "You win!"); break;
      }//end of switch
   
   }//end of main


}//end of class