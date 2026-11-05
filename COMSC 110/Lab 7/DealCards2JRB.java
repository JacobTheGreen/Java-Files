//***************************************************
//DealCards2JRB.java
//
//Author:Jacob Brosnan
//Date: 10-14-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Simulates dealing cards with more than 1 method
//***************************************************

import java.util.Scanner;

public class DealCards2JRB{   //header of the class
   public static void main(  String[] args ){
   
      int num = (int) Math.floor(Math.random() * 13) + 1; //creates a number to determine the value of the card
      int cardType = (int) Math.floor(Math.random() * 4) + 1; //creates a number to determine the Suite of the card
      String moreCards = "Y"; //initializes and declares the variable that controls the while loop
      int cardsDealt = 0; //the cardsDealt variable tracks the number of cards that are dealt
      
      
      Scanner input = new Scanner( System.in );//declares the scanner input that is used
      
      //states the next card as well as how many cards have been dealt and asks the user whether they want it or not
      while( moreCards.equals("Y") ){
         num = (int) Math.floor(Math.random() * 13) + 1; //picks a random number between 1 and 13
         cardType = (int) Math.floor(Math.random() * 4) + 1; //picks a random number between 1 and 4
         
         
         //prints out the next and how many cards have been dealt out
         System.out.println("\nThe next card is " + getCardNum( num ) + " of " + getCardSuite( cardType ) + "\n \n" + "You have been dealt " + cardsDealt + " cards.");
         
         //asks the user whether they want another card or not and if the input is N it exits the while loop
         System.out.println("Do you want another card? (Enter Y or N)");
         moreCards = input.next();
         
         //adds one to the cards dealt
         cardsDealt++;
         
         
      }
   
        
   }//end of main

   public static String getCardNum( int num ){
      String cardNum = ""; //initializes and declares the variable that is used to print out the value of the card
      //sets the cardNum variable to the appropriate string
      switch( num ){
         case 1: cardNum = "Ace"; break;
         case 2, 3, 4, 5, 6, 7, 8, 9, 10: cardNum = Integer.toString(num); break;
         case 11: cardNum = "Jack"; break;
         case 12: cardNum = "Queen"; break;
         case 13: cardNum = "King"; break;
      }//end of switch
      return cardNum;
   }//end of getCardNum method
   
   
   public static String getCardSuite( int cardType ){
      String cardSuite = ""; //initializes and declares the variable that is used to print out the Suite of the card
      //sets the cardType variable to the appropriate string
      switch( cardType ){
         case 1: cardSuite = "Spades"; break;
         case 2: cardSuite = "Hearts"; break;
         case 3: cardSuite = "Clubs"; break;
         case 4: cardSuite = "Diamonds"; break;
      }//end of switch
      return cardSuite;
   }//end of getCardSuite method
   
   
}//end of class