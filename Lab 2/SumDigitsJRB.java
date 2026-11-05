//***************************************************
//SumDigitsJRB.java
//
//Author:Jacob Brosnan
//Date: 9-4-26
//Class:COMSC110 FA 26
//Instructor: Dr. Gupta
//
//Purpose: Breaks down a four digit number into multiple individual digits
//***************************************************


import java.util.Scanner;

public class SumDigitsJRB{

   public static void main(  String[] args ){
   //Step 1: input a four digit number
   Scanner scan = new Scanner ( System.in );
   System.out.println("Enter a four digit interger: ");
   int fourDigitNum = scan.nextInt(); //step 2: sets the input to the fourDigitNum variable
   
   int digit1 = fourDigitNum % 10; //step 3: calculates the digit in the ones place and sets digit1 to it
   int digit2 = (fourDigitNum / 10) % 10; //step 4: calculates the digit in the tens place and sets digit2 to it
   int digit3 = (fourDigitNum /100) % 10; //step 5: calculates the digit in the hundreds place and sets digit3 to it
   int digit4 = fourDigitNum / 1000; //step 6: calculates the digit in the thousands place and sets digit4 to it
   
   //step 7:  calculates the sum of the digits
   int sumDigits = digit1 + digit2 + digit3 + digit4;
   
   //step 8: prints out the sum of the digits
   System.out.println(digit4 + " + " + digit3 + " + " + digit2 + " + " + digit1 + " = " + sumDigits);
   
   }
}