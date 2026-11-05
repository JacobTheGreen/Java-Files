//***************************************************
//BestSellerJRB.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-18-26
//Instructor: Dr. Gupta
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Compares the discounted price of an item from three sellers
//***************************************************

import java.util.Scanner;

public class BestSellerJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //allows an input from the user for Seller 1
      Scanner input = new Scanner( System.in );
      System.out.println("What is the price of an item from Seller 1: ");
      double seller1Price = input.nextDouble();
      
      System.out.println("What is the discount offered by Seller 1: ");
      double seller1Discount = input.nextDouble();
      
      //allows an input from the user for Seller 2
      System.out.println("What is the price of an item from Seller 2: ");
      double seller2Price = input.nextDouble();
      
      System.out.println("What is the discount offered by Seller 2: ");
      double seller2Discount = input.nextDouble();
      
      //allows an input from the user for Seller 3
      System.out.println("What is the price of an item from Seller 3: ");
      double seller3Price = input.nextDouble();
      
      System.out.println("What is the discount offered by Seller 3: ");
      double seller3Discount = input.nextDouble();
      
      double seller1FinalPrice =  (seller1Price * ((100 - seller1Discount)/100));
      double seller2FinalPrice =  (seller2Price * ((100 - seller2Discount)/100));
      double seller3FinalPrice =  (seller3Price * ((100 - seller3Discount)/100));
      
      System.out.println("Seller 1 with a price of $" + seller1Price + " and a discount of " + seller1Discount + "% has a final price of $" + seller1FinalPrice);
      System.out.println("Seller 2 with a price of $" + seller2Price + " and a discount of " + seller2Discount + "% has a final price of $" + seller2FinalPrice);
      System.out.println("Seller 3 with a price of $" + seller3Price + " and a discount of " + seller3Discount + "% has a final price of $" + seller3FinalPrice);
      
      //Determines and prints out who has the lowest price of the 3 sellers
      System.out.println(
         (seller1FinalPrice < seller2FinalPrice)?
            (seller1FinalPrice < seller3FinalPrice)? "Seller 1 has the best discounted price at $" + seller1FinalPrice + "." : "Seller 3 has the best discounted price at $" + seller3FinalPrice + "." :
            (seller2FinalPrice < seller3FinalPrice)? "Seller 2 has the best discounted price at $" + seller2FinalPrice + ".": "Seller 3 has the best discounted price at $" + seller3FinalPrice + "."
      );//end of system print
      
   }//end of main


}//end of class