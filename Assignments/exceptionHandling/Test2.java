package com.solution.exceptionHandling;

import java.util.Scanner;

class NegativeNo extends Exception {
  
	public NegativeNo(String message) {
		
        super(message);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        	
            System.out.print("Enter an number:: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNo("Negative numbers are not allowed!!!");
            }

            System.out.println("Your Number:: " +number);

        } catch (NegativeNo e) {
            System.out.println("Exception:: " +e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Invalid Number...");
            
        } finally {
            scanner.close();
            System.out.println("Execution Successful...");
        }
    }
}
