package com.solution.Integer;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    Set<Integer> numbers = new TreeSet<>();
	    
	    System.out.println("Enter integers & to finish type 'd' (ex.1 3 5 7 9 6 8 d): ");
	    
	    while (scanner.hasNextInt()) {
	        numbers.add(scanner.nextInt());
	    }
	
	    if (numbers.size() < 2) {
	        System.out.println("Not found second smallest and largest inreger.");
	        return;
	    }
	
        Integer[] sortedNumbers = numbers.toArray(new Integer[0]);
	
	    System.out.println("Sorted numbers: " + numbers);
	
	    int secondSmallest = sortedNumbers[1];
        int secondLargest = sortedNumbers[sortedNumbers.length - 2];
	
	    System.out.println("Second smallest number: " + secondSmallest);
	    System.out.println("Second largest number: " + secondLargest);
	}
	

}
