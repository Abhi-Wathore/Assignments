package com.solution.diffrence;

	//Interface 
	interface Animals {
		
	// Abstract method 
	 void sound(); 
	
	}
	
	//Abstract class 
	abstract class Animal {
		
	 // Abstract method
	 public abstract void habitat(); 
	
	 // Concrete method
	 public void sleep() {
		 
	     System.out.println("Animal is sleeping (from abstract class)");
	     
	 }
	}

	
	class Dog extends Animal implements Animals {
		
	 @Override
	 public void habitat() {
	     System.out.println("Dog lives in a house");
	 }
	
	 @Override
	 public void sound() {
	     System.out.println("Dog barks");
	 }
	}

	 public class Abst_Inter {
	  public static void main(String[] args) {
	     Dog dog = new Dog(); 

     dog.habitat();    
     dog.sound();      
     dog.sleep();     

     
     // Key points of Abstract Class and Interface:-
    
     System.out.println("\n=== Key Points About Abstract Class ===");
     System.out.println("1. Abstract classes can contain both abstract and concrete methods."
     		+ "\n2. Abstract classes provide shared functionality that can be inherited."
     		+ "\n3. A class can only extend one abstract class."
     		+ "\n4. Abstract classes can have instance variables."
     		+ "\n5. Abstract classes can have constructors."
     		+ "\n6. Abstract classes can define methods with any access modifier (public, protected, private).");
   

     System.out.println("\n=== Key Points About Interface ===");
     System.out.println("1. Interfaces contain only abstract methods by default."
    		 			+"\n2. Interfaces can have default methods."
				        +"\n3. Interfaces cannot have constructors."
				        +"\n4. A class can implement multiple interfaces."
				        +"\n5. All variables in an interface are implicitly public, static, and final (constants)."
				        +"\n6. Methods in an interface are public by default.");
 }
}
