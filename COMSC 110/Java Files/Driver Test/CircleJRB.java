//***************************************************
//CircleJRB.java
//
//Author: Jacob Brosnan
//Date: 10-9-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo how to write your own class called Circle
//***************************************************

public class CircleJRB {
   //no main() method here needed
   //1. data field - represent the state of a class object
   private double radius;//private only visible to class member
   private String color;//instance variables(non-static), specific to an object
   
   
   static int numOfObjects = 0; //static membe,r class level, shared
   
   //2. methods - define behavior of a class object
   //define constructors
   //constructors are methods: special methods
   //- method name is the same as your class
   //- method does NOT return back anything, NOT even void
   public CircleJRB(){ //- deualt no arg constructor
      radius = 10.0;
      color = "red";
      
      numOfObjects++;
   }
   
   //overloading the constructor
   public CircleJRB( double r ){
      radius = r;
      color = "red";
      
      numOfObjects++;
   }
   
   
   //define getters and setters
   public double getRadius(){
      double result;
      result = radius;
      return result;
   }
   public String getColor(){
      String result;
      result = color;
      return result;
   }
   static int getNumOfObjects(){
      int result;
      result = numOfObjects;
      return result;
      //return numOfObjects;
   }
   
   static int getNumOfObjects( int obj ){
      int result;
      result = obj;
      return result;
      //return numOfObjects;
   }
   
   //setter
   public void setRadius( double r ){
      radius = r;
   }
   
   
   
   //define a method to return the area of this cricle
   public double getArea( int radius ){
      double result = Math.PI * radius * radius;
      return result;
   }
   
   //declare a toString() method to represent objects from this class
   public String toString(){
      String result;
      result = radius + " " + color;
      return result;
   }
   
   
   
   
   
}//end of class
