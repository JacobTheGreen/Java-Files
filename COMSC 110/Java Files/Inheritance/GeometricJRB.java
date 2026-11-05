//***************************************************
//GeometricJRB.java
//
//Author: Jacob Brosnan
//Date: 11-4-26
//Instructor: Dr. Bai
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Demo inheritance, this class serves as the parent class
//***************************************************

public class GeometricJRB {
   //1. Data Fields - defines the characteristics
   String color;
   boolean filled;
      
   //2. Methods - defines the behavior
   
   public GeometricJRB(){
      color = "red";
      filled = false;
   }//end of constructor
   
   
   //create a getter method for both color and filled
   public String getColor(){
      String result = color;
      return result;
   }//end of getter
   
   public boolean getFilled(){
      boolean result = filled;
      return result;
   }//end of getter
   
   
   //create a setter method for both color and filled
   public void setColor( String c ){
      color = c;
   }//end of setter
   
   public void setFilled( boolean f ){
      filled = f;
   }//end of setter
   
   
   //create a toString() method to print out the objects of the class
   public String toString(){
      String result = "Geometric object has color of " + color + " is filled? " + filled;
      return result;
   }//end of toString()
   
   
}//end of class
