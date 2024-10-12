package com.solution.bank;
import java.util.Scanner;

public class Bank implements IBank{
	
	int balance;
	
	public Bank(int balance){
		this.balance=balance;
	}

	@Override
	public void balanceCheck() {
		System.out.println("Your Total Bankbalance is:: "+balance);

	}

	@Override
	public void deposit() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your Amount to Deposit in Your Account ");
		int num =s.nextInt();
	
		System.out.println(num+" Amount Deposit to your account");
		System.out.println(balance+num+" Final Amount in your Account");

}

	public void withdrawn() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your Amount to Withdrawn from Your Account ");
		int num = s.nextInt();
		
		System.out.println(num+" Amount Withdrawn from your account");
		System.out.println(balance-num+" Final Amount in your Account");

		
		
	}
}