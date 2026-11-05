//***************************************************
//Month_Jacob_Brosnan.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 9-11-26
//Instructor: Dr. Gupta
//Class:COMSC110 & Lab - FA 26
//
//Purpose: Prints the amount of days in a given month and year
//***************************************************

import java.util.Scanner;

public class Month_Jacob_Brosnan{   //header of the class
   //add method
   public static void main(  String[] args ){
      //allow an input from the user for a month
      Scanner input = new Scanner( System.in );
      System.out.println("Enter a month (1 for Jan., 2 for Feb., etc.): ");
      int month = input.nextInt();
      
      //allows an input from the user for a year
      Scanner input1 = new Scanner( System.in );
      System.out.println("Enter a year: ");
      int year = input1.nextInt();
      
      
         //Outputs month, year, and # of days
         switch ( month ){
            case 1: System.out.println("January " + year + " has 31 days");break;
            case 2: if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        System.out.println("February " + year + " has 29 days");}
                    else{
                        System.out.println("February " + year + " has 28 days"); //
                    }break;
            case 3: System.out.println("March " + year + " has 31 days");break;
            case 4: System.out.println("April " + year + " has 30 days");break;
            case 5: System.out.println("May " + year + " has 31 days");break;
            case 6: System.out.println("June " + year + " has 30 days");break;
            case 7: System.out.println("July " + year + " has 31 days");break;
            case 8: System.out.println("August " + year + " has 31 days");break;
            case 9: System.out.println("September " + year + " has 30 days");break;
            case 10: System.out.println("October " + year + " has 31 days");break;
            case 11: System.out.println("November " + year + " has 30 days");break;
            case 12: System.out.println("December " + year + " has 31 days");break;
            default : System.out.println("Try again, use a valid year and month!");
         }//end of switch
      

      
      
      
   }//end of main


}//end of class