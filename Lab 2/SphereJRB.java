//***************************************************
//SphereJRB.java
//
//Author:Jacob Brosnan
//Date: 9-4-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: Calculate the surface area and volume based off an inputted radius
//***************************************************


import java.util.Scanner;

public class SphereJRB{

   public static void main(  String[] args ){
   //Step 1: prompts for a raidus to be inputted
   Scanner scan = new Scanner ( System.in );
   System.out.println("Enter the value of the radius: ");
   double radius = scan.nextInt(); //step 2: sets the input to the radius variable
   
   double volume = 1.3333333 * 3.1415926 * (radius * radius * radius); //step 3: calculates the volume
   System.out.println("The volume is: " + volume); //step 4: displays the volume
   double surfaceArea = 4 * 3.1415926 * (radius * radius); //step 5: calculates the surface area
   System.out.println("The surface area is: " + surfaceArea); //step 6: displays the surface area
   }
}