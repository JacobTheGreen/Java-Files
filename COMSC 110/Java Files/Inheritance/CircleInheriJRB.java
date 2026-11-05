//***************************************************
//CircleInheriJRB.java
//
//Author: Jacob Brosnan
//Date: 11-4-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo inheritance, this class serves as the child subclass
//***************************************************

public class CircleInheriJRB extends GeometricJRB{
   //1. data fields
   private double radius;//within the same class
   
   
   //2. methods
   
   public CircleInheriJRB(){
      super(); //explicitly calling parent class's constructor
      radius = 3.0;
   }//end of constructor
   
   public double getRadius(){
      return radius;
   }//end of getter
   
   public void setRadius( double r ){
      radius = r;
   }//end of getter
   
   public String toString(){
      return "radius is: " + radius;
   }//end of toString()
   
}//end of class
