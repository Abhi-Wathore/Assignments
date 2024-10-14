package com.solution.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;
	    
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1;  
            } else {
                high = mid - 1;
            }
            
        }
            return -1;

    }

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("Sorted array:: " + Arrays.toString(arr) );
        
        
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Value found at index: " + result);
        }

        scanner.close();
    
	}

}
