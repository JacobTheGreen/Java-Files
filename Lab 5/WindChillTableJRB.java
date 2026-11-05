//***************************************************
//WindChillTableJRB.java
//
//Author:Jacob Brosnan
//Date: 10-2-26
//Class:COMSC110 & Lab - FA 26
//Instructor: Dr. Gupta
//
//Purpose: Creates a wind chill table
//***************************************************

import java.util.Scanner;

public class WindChillTableJRB{   //header of the class
   public static void main(  String[] args ){

      System.out.println("Calm  | 40  35  30  25  20  15  10  5  0   -5  -10  -15  -20  -25  -30  -35  -40  -45");
      System.out.println("-------------------------------------------------------------------------------------");
      
      
      //prints out the wind chill table
      for (int i = 5; i < 61; i += 5) System.out.println(i + "  |  " + 
      Math.round(35.74 + 0.6215 * 40 - 35.75 * Math.pow(i, 0.16) + 0.4275* 40 * Math.pow(i, 0.16)) + "  " + //40 temp
      Math.round(35.74 + 0.6215 * 35 - 35.75 * Math.pow(i, 0.16) + 0.4275* 35 * Math.pow(i, 0.16)) + "  " + //35 temp
      Math.round(35.74 + 0.6215 * 30 - 35.75 * Math.pow(i, 0.16) + 0.4275* 30 * Math.pow(i, 0.16)) + "  " + //30 temp
      Math.round(35.74 + 0.6215 * 25 - 35.75 * Math.pow(i, 0.16) + 0.4275* 25 * Math.pow(i, 0.16)) + "  " + //25 temp
      Math.round(35.74 + 0.6215 * 20 - 35.75 * Math.pow(i, 0.16) + 0.4275* 20 * Math.pow(i, 0.16)) + "  " + //20 temp
      Math.round(35.74 + 0.6215 * 15 - 35.75 * Math.pow(i, 0.16) + 0.4275* 15 * Math.pow(i, 0.16)) + "  " + //15 temp
      Math.round(35.74 + 0.6215 * 10 - 35.75 * Math.pow(i, 0.16) + 0.4275* 10 * Math.pow(i, 0.16)) + "  " + //10 temp
      Math.round(35.74 + 0.6215 * 5 - 35.75 * Math.pow(i, 0.16) + 0.4275* 5 * Math.pow(i, 0.16)) + "  " + //5 temp
      Math.round(35.74 + 0.6215 * 0 - 35.75 * Math.pow(i, 0.16) + 0.4275* 0 * Math.pow(i, 0.16)) + "  " + //0 temp
      Math.round(35.74 + 0.6215 * -5 - 35.75 * Math.pow(i, 0.16) + 0.4275* -5 * Math.pow(i, 0.16)) + "  " + //-5 temp
      Math.round(35.74 + 0.6215 * -10 - 35.75 * Math.pow(i, 0.16) + 0.4275* -10 * Math.pow(i, 0.16)) + "  " + //-10 temp
      Math.round(35.74 + 0.6215 * -15 - 35.75 * Math.pow(i, 0.16) + 0.4275* -15 * Math.pow(i, 0.16)) + "  " + //-15 temp
      Math.round(35.74 + 0.6215 * -20 - 35.75 * Math.pow(i, 0.16) + 0.4275* -20 * Math.pow(i, 0.16)) + "  " + //-20 temp
      Math.round(35.74 + 0.6215 * -25 - 35.75 * Math.pow(i, 0.16) + 0.4275* -25 * Math.pow(i, 0.16)) + "  " + //-25 temp
      Math.round(35.74 + 0.6215 * -30 - 35.75 * Math.pow(i, 0.16) + 0.4275* -30 * Math.pow(i, 0.16)) + "  " + //-30 temp
      Math.round(35.74 + 0.6215 * -35 - 35.75 * Math.pow(i, 0.16) + 0.4275* -35 * Math.pow(i, 0.16)) + "  " + //-35 temp
      Math.round(35.74 + 0.6215 * -40 - 35.75 * Math.pow(i, 0.16) + 0.4275* -40 * Math.pow(i, 0.16)) + "  " + //-40 temp
      Math.round(35.74 + 0.6215 * -45 - 35.75 * Math.pow(i, 0.16) + 0.4275* -45 * Math.pow(i, 0.16)));//-45 temp
      
      
            
   }//end of main


}//end of class