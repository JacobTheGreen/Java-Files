//***************************************************
//GeometryJRB.java
//
//Author:Jacob Brosnan
//Date: 10-14-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Calculates the rea of a circle, rectangle, and triangle
//***************************************************

import java.util.Scanner;

public class GeometryJRB{   //header of the class
   public static void main(  String[] args ){
      Scanner input = new Scanner( System.in );//declares the scanner input that is used
      
      System.out.println("1. Calculate the Area of a Circle\n2. Calculate the Area of a Rectangle\n3. Calculate the Area of a Triangle\n4. Quit");
      int option = input.nextInt();
      
      switch( option ){
         case 1: System.out.println("What is the radius of the circle?");
                 double radius = input.nextDouble(); 
                 circle( radius );
                 break;
                 
                 
         case 2: System.out.println("What is the length of the rectangle?");
                 double length = input.nextDouble(); 
                 System.out.println("What is the width of the rectangle?");
                 double width = input.nextDouble();
                 
                 rectangle( length, width );
                 break;
                 
                 
         case 3: System.out.println("What is the base of the triangle?");
                 double base = input.nextDouble(); 
                 System.out.println("What is the height of the triangle?");
                 double height = input.nextDouble();
                 
                 triangle( base, height );
                 break;
         case 4: ; System.out.println("The program will terminate."); break;
         default: System.out.println("The number entered is outside of the 1-4 range."); break;
      }//end of switch

      
   }//end of main
   
   public static void circle( double radius ){
      if( radius > 0.0 ){
         double area = Math.PI * radius * radius;
         System.out.println("The area of a circle with the radius of " + radius + " is: " + area );
      }
      else{
         System.out.println("The entered values are invalid.");
      }
   }//end of circle method
   
   public static void rectangle( double length, double width ){
      if( length > 0.0 && width > 0.0 ){
         double area = length * width;
         System.out.println("The area of a rectangle with the length of " + length + " and width of " + width + " is: " + area );
      }
      else{
         System.out.println("The entered values are invalid.");
      }
   }//end of rectangle method
   
   public static void triangle( double base, double height ){
      if( base > 0.0 && height > 0.0 ){
         double area = ( base * height ) / 2.0;
         System.out.println("The area of a triangle with the base of " + base + "and height of " + height + " is: " + area );
      }
      else{
         System.out.println("The entered values are invalid.");
      }
   }//end of triangle method

}//end of class