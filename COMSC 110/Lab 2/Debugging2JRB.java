//***************************************************
//Debugging2JRB.java
//
//Author:Jacob Brosnan
//Date: 9-4-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: The purpose is to practice debugging skills
//***************************************************

import java.util.Scanner;

public class Debugging2JRB 
{
   public static void main(String[] args){
      final double TAX = 0.06;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the price: ");
      int price = scan.nextInt();
      
      double totalPrice = price + TAX * price;
      System.out.println("The total including tax is $" + totalPrice);
   }
}