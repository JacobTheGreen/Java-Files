//***************************************************
//DriverCircleJRB.java
//
//Author: Jacob Brosnan
//Date: 10-13-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to call aclass that you defined - Driver Class
//***************************************************

public class DriverCircleJRB{
   public static void main( String[] args ){
      //create an object from the class called CircleJRB
      //Scanner scan = new Scanner ( System.in );
      CircleJRB circle1 = new CircleJRB();//constructor CircleJRB()
      //System.out.println( circle1.radius );//10.0
      System.out.println( circle1.getRadius() );//10.0
      //repeat same steps for color
      System.out.println( circle1.getColor() );//red
      circle1.setRadius( 25.0 );
      System.out.println( circle1.getRadius() );//25.0
      
      //call the overloaded constructor to set up a new obj
      // called circle1
      CircleJRB circle2 = new CircleJRB( 99.9 );//
      System.out.println( circle2.toString() );//99.9 red
      
      System.out.println( CircleJRB.numOfObjects );
      
      System.out.println("The total number of objects created is: " + CircleJRB.getNumOfObjects() );
      
      
      
      System.out.println("The total number of objects created is: " + CircleJRB.getNumOfObjects(3) );
      
      
   }//end of main
   
}//end of class