//***************************************************
//ConeVolumeJRB.java
//
//Author:Jacob Brosnan
//Date: 9-25-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: Prompt the user for a height and radius of two cones, computes the volume of both cones and outputs the volume and which is bigger.
//***************************************************

import java.util.Scanner;

public class ConeVolumeJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //creates a new scanner
      Scanner input = new Scanner( System.in );
      
      //asks for an input from the user for the radius of the first cone
      System.out.println("What is the radius of the first cone's base: ");
      double cone1Radius = input.nextDouble();
      
      //asks for an input from the user for the height of the first cone
      System.out.println("What is the height of the first cone: ");
      double cone1Height = input.nextDouble();
      
      //asks for an input from the user for the radius of the second cone
      System.out.println("What is the radius of the second cone's base: ");
      double cone2Radius = input.nextDouble();
      
      //asks for an input from the user for the height of the second cone
      System.out.println("What is the height of the second cone: ");
      double cone2Height = input.nextDouble();
      
      //computes the volume of both of the volumes of the cones   
      double cone1Volume =  (1.0/3 * Math.PI * Math.pow(cone1Radius,2) * cone1Height);
      double cone2Volume =  (1.0/3 * Math.PI * Math.pow(cone2Radius,2) * cone2Height);
      
      //prints out the volumes of both volumes
      System.out.println("The volume of cone 1 is " + cone1Volume + " and the volume of cone 2 is " + cone2Volume);
      
      //determines which cone has a bigger volume and prints the results
      if(cone1Volume > cone2Volume){
      System.out.println("The volume of cone 1 is bigger than the volume of cone 2.");
      }
      else if(cone2Volume > cone1Volume){
      System.out.println("The volume of cone 2 is bigger than the volume of cone 1.");
      }
      else{
      System.out.println("The volume of cone 1 is equal to the volume of cone 2.");
      }
   
   }//end of main


}//end of class