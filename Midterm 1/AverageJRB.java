//***************************************************
//AverageJRB.java
//
//Author:Jacob Brosnan
//Date: 9-25-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: Prompt the user three sets of 2 numbers and computes the avergaes of the three sets and outputs which set has a higher average and the average of the average numbers
//***************************************************

import java.util.Scanner;

public class AverageJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //creates a new scanner
      Scanner input = new Scanner( System.in );
      
      
      //asks for an input from the user for the first number in the first set
      System.out.println("What is the first number of the first set: ");
      int set1n1 = input.nextInt();
      //asks for an input from the user for the second number in the first set
      System.out.println("What is the second number of the first set: ");
      int set1n2 = input.nextInt();
      
      
      //asks for an input from the user for the first number in the second set
      System.out.println("What is the first number of the second set: ");
      int set2n1 = input.nextInt();
      //asks for an input from the user for the second number in the second set
      System.out.println("What is the second number of the second set: ");
      int set2n2 = input.nextInt();
      
      
      //asks for an input from the user for the first number in the third set
      System.out.println("What is the first number of the third set: ");
      int set3n1 = input.nextInt();
      //asks for an input from the user for the second number in the third set
      System.out.println("What is the second number of the third set: ");
      int set3n2 = input.nextInt();
      
      
      
      
      //computes the averages of the three sets   
      double set1Average =  ((set1n1 + set1n2) / 2.0);
      double set2Average =  ((set2n1 + set2n2) / 2.0);
      double set3Average =  ((set3n1 + set3n2) / 2.0);
      
      
      
      //computes the average of the averages
      double setsAverage =  ((set1Average + set2Average + set3Average) / 3.0);
      

      
      //determines which average has the highest value and prints the results
      System.out.println((set1Average > set2Average)? (set1Average > set3Average)? "The average of set 1 is higher than both sets 2 and 3 with an average of " + set1Average : "The average of set 3 is higher than both sets 1 and 2 with an average of " + set3Average :
         (set2Average > set3Average)? "The average of set 2 is higher than both sets 1 and 3 with an average of " + set2Average : "The average of set 3 is higher than both sets 1 and 2 with an average of " + set3Average );
      
      //outputs the average of all three averages
      System.out.println("The average of all three sets of numbers is " + setsAverage);
      
      
   }//end of main


}//end of class