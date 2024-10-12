package com.solution.bank;
import java.util.Scanner;

public class Test {
	
	public void bankHdfc() {
		System.out.println("\n********* Welcome *********");
		System.out.println("\nSelect Option::\n 1.Check Balance \n 2.Withdrawn \n 3.Deposit \n 4.Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Option::");
		int option = sc.nextInt();
		
		Bank sbi = new Bank(10000);
		
		switch(option) {
		case 1:sbi.balanceCheck();
			break;
		case 2:sbi.withdrawn();
			break;
		case 3:sbi.deposit();
			break;
		case 4:System.out.println("Thanks to visit SBI");
			
	 }

   }
}
