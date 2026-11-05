//***************************************************
//TestJavaJRB.java     --Header Doc
//
//Author:Jacob Brosnan
//Date: 8-31-26
//Class:COMSC110 FA 26
//Instructor: Dr. Bai
//
//Purpose: Demo the structure of a java program
//***************************************************

import java.util.Scanner;

public class TestJavaJRB{   //header of the class
   //add method
   public static void main(  String[] args ){
      //declare a constant
      final double PI = 3.1415; //PI i constant. changes NOT allowed. Use all CAPS for constant names
      
      
      //statements
      System.out.println( "Welcome to COMSC110 again!"  );
      System.out.println( "Today is Monday 8-31-26"  );
      //difference between print and println(new line)
      System.out.print("Three");
      System.out.print("Two");
      System.out.print("One"); //ThreeTwoOne
      
      //problem - solving 
      //algorithm
      //Step 1: input a temp in F
      double tempF = 70.5; //declare a variable,initialize the variable
      
      
      //Step 2: do math, conert from F to C
      double tempC = (tempF - 32) * 5/9;
      
      //Step 3: display the C
      System.out.println( tempC );
      
      //Demoing types of errors
      System.out.println( " Demo different types of errors:  " );
      
      //step1: declare a variable to represent the # of students in our class
      //int numOfStudent = 22;
      
      //interactive input from the keyboard
      Scanner scan = new Scanner( System.in ); //read in from the keyboard
      System.out.println("Enter the number of students: ");
      int numOfStudent = scan.nextInt(); //call nextInt() method to read in an interger
      //scan.nextDouble();//read in floating point numbers from the keyboard
      
      
      //step2: declare another variable to represent # of classes you are taking
      int classesTaken = 5;
      
      //step3: declare a variable to representy # of classrooms in SE building
      int numOfClassroom = 30;
     
      //step4: declare a variable to represent # of groups in COMSC110
      int numOfGroups = 15;
      
      //step5: figure out the average # of students in each group
      //int numOfStudentPerGroup = numOfStudent/numOfGroups //syntax error for missing;
      int numOfStudentPerGroup = numOfStudent / numOfGroups;//runtime error if numOfGroups is zero
      
      //step6: display the average # of student
      System.out.println("Average number of students per group is: " + numOfStudentPerGroup);
      
      //create a logic error
      System.out.println("Average num of students per group is with logic error: " + numOfStudent / numOfGroups );//
      
      //try the library functions
      System.out.println(Math.pow( 3 , 2 )); //3^2 = 9 => 9.0
      
   }//end of main


}//end of class