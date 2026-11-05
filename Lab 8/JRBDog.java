//***************************************************
//JRBDog.java
//
//Author: Jacob Brosnan
//Date: 10-16-26
//Instructor: Dr. Gupta
//Class: COMSC110 & Lab - FA 26
//
//Purpose: Writing a class to be called on by the JRBKennel class
//***************************************************


public class JRBDog {
   String name;
   int age;
   
   
   
   
   public JRBDog(){
      name = "Jordan";
      age = 2;
   }
   
   //allows the user to input a name
   public JRBDog( String n ){
      name = n;
      age = 3;
   }
   
   //allows the user to input an age
   public JRBDog( int a ){
      name = "Joe";
      age = a;
   }
   
   //allows the user to input a name and age
   public JRBDog( String n, int a ){
      name = n;
      age = a;
   }
   
   
   //getters
   public String getName(){
      String result;
      result = name;
      return result;
   }
   public int getAge(){
      int result;
      result = age;
      return result;
   }
   
   
   //setters
   public void setName( String r ){
      name = r;
   }
   public void setAge( int r ){
      age = r;
   }
   
   
   
   //toString() method
   public String toString(){
      String result;
      result = name + " " + age;
      return result;
   }
   public int dogToPpleYrs(){
      int result;
      result = age * 7;
      return result;
   }
}//end of class