package bank_account;

import java.text.DecimalFormat;
import java.util.Random;

public class BankAccount {
	DecimalFormat df = new DecimalFormat("#.00");
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int accountsCount = 0;
	public static double totalAmount = 0;
	
	private String setAccountNumber() {
		Random account = new Random();
		String accountNum = "";
		for(int i =0; i<10; i++) {
			accountNum += String.valueOf(account.nextInt(10-1+1) +1);
		}
		return accountNum;
	}
	
	public BankAccount() {
		this.accountNumber = setAccountNumber();
		accountsCount ++;
	}
	
	private double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	private double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void getBalances() {
		System.out.println("Total Checking account balance: $"+df.format(getCheckingBalance()));
		System.out.println("Total Savings account balance: $"+df.format(getSavingsBalance()));
	}
	
	public void deposit(String accountType, double amount) {
		if(accountType == "checking") {
			this.checkingBalance += amount;
			
		}
		else if(accountType == "savings") {
			this.savingsBalance += amount;
		}

		totalAmount += amount;
		System.out.println("Deposited $"+df.format(amount)+" into your "+accountType+" account.");
	}
	
//	public void withdrawcheckings(double amount) {
//		if(amount > this.checkingBalance) {
//			System.out.println("Insufficient funds..");
//		}
//		else {
//			this.checkingBalance -= amount;
//		}
//	}
//	public void withdrawsavings(double amount) {
//		if(amount > this.savingsBalance) {
//			System.out.println("Insufficient funds..");
//		}
//		else {
//			this.savingsBalance -= amount;
//		}
//	}
	
	public void withdraw(String accountType, double amount) {
		if(accountType == "checking") {
			if(amount > this.checkingBalance) {
				System.out.println("Insufficient funds to withdraw " + amount + " from " + accountType + " account.");
			}
			else {
				this.checkingBalance -= amount;
			}
		}
		
		
			if(accountType == "savings") {
				if(amount > this.savingsBalance) {
					System.out.println("Insufficient funds to withdraw " + amount + " from " + accountType + " account.");
				}
				else {
					this.savingsBalance -= amount;
				}
			}
			totalAmount -= amount;
	}
}


