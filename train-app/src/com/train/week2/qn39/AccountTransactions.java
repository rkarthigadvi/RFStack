package com.train.week2.qn39;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AccountTransactions {

			/*
		 * Question 39 : Account Transactions Write a program to allow users to perform
		 * the following transactions on their bank account. � Deposit � Withdraw
		 * Display the balance amount after the completion of each transaction. Note: �
		 * Create a class called Account with 2 private member variables o accountNumber
		 * of type String o balance of type int � Include 2 argument constructor. �
		 * Include getter / setter method for accountNumber. � Include only getter for
		 * balance. � Create a method deposit() based on below method signature. Add
		 * transactionAmount to the balance instance variable. public void deposit(int
		 * transactionAmount) � Create another method withdraw() which reduces the
		 * balance amount based on the transactionAmount. If the balances go below zero
		 * after withdrawal, then the transaction should not be performed, and the
		 * earlier balance should be retained. This method displays insufficient balance
		 * when the balance is about to go below zero. public void withdraw(int
		 * transactionAmount) Sample Input and Output1: Enter the Account Number 1000321
		 * Enter the Account Balance 5000 Enter 1 to deposit an amount, 2 to withdraw an
		 * amount 1 Enter the amount to deposit 1000 Your balance after the transaction
		 * is: 6000 Sample Input and Output2: Enter the Account Number 1000321 Enter the
		 * Account Balance 5000 Enter 1 to deposit an amount, 2 to withdraw an amount 2
		 * Enter the amount to withdraw 1000 Your balance after the transaction is: 4000
		 * Sample Input and Output3: Enter the Account Number 1000321 Enter the Account
		 * Balance 5000 Enter 1 to deposit an amount, 2 to withdraw an amount 2 Enter
		 * the amount to withdraw 10000 Insufficient Balance Your balance after the
		 * transaction is: 5000
		 */

		/*
		 * PsuedoCode: Perform account transactions
		 */
	
	private String accountNumber;
	private int balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public AccountTransactions (String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withdrawAmount (int transactionAmount) {
		
		if ((this.balance - transactionAmount) > 0) {
			
			this.balance = this.balance - transactionAmount;
		} else {
			System.out.println("Insufficient Balance");
		}
		
	}
	
	public void depositAmount (int transactionAmount ) {
		
		this.balance = this.balance + transactionAmount;
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String acctNumber=scan.next();
		
		System.out.println("Enter the Account Balance");
		int balance=scan.nextInt();
		
		AccountTransactions accountTrans = new AccountTransactions(acctNumber, balance);
		
		System.out.println("Enter 1 to deposit an amount, or Enter "+	"2 to withdraw an amount ");
		
		int choice = scan.nextInt();
		
		if (choice == 1) {
			
			System.out.println("Enter the amount to be deposit");
			accountTrans.depositAmount(scan.nextInt());
		} else
		{
			System.out.println("Enter the amount to be withdraw");
			accountTrans.withdrawAmount(scan.nextInt());
		}
		scan.close();
		System.out.println("Your balance after the transaction is:"+accountTrans.getBalance());
	}

}