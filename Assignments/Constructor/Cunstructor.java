package com.solution.Constructor;

class Parent {// This is Parent class
	
 public Parent() {// This is Parent class Constructor
	 
     System.out.println("Parent class constructor initialize...");
     
 }
}

class Child extends Parent {// This is Child class 
	
 public Child() {// This is Child class Constructor
	 
     super(); // Here super() method Calling Parent class constructor
     
     System.out.println("Child class constructor initialize...");
     
     System.out.println();
     
     System.out.println("KEY POINTS OF CONSTRUCTOR::");
     System.out.println("\n1.The constructor has the same name as the class in which it resides.");
     System.out.println("2.Constructors do not have a return type, not even void.");
     System.out.println("3.The primary purpose of a constructor is to initialize the newly created object.");
     System.out.println("4.If you do not define any constructor in your class, the Java compiler inserts a default constructor into your code on your behalf."
     					+ "\nThis default constructor is called when an object of the class is instantiated.");
     System.out.println("5.A constructor can call another constructor in the same class using this() keyword. This is known as constructor chaining.");
     System.out.println("6.If a class is derived from another class, the derived class has a chance to call the constructor of its base class. "
     					+ "This is done using the super() keyword.");
     
     
     
 }
}

public class Cunstructor {
	
 public static void main(String[] args) {
	 
     Child childObject = new Child(); // Here is object created for child class
     
 }
}
