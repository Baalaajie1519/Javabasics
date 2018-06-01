package com.basics;

public class SavingAccount {
	public static int annualInterestRate;
	double savingBalance;
	public void savingBalance(double balance){
		this.savingBalance=balance;
	}
	public void calculateMonthlyInterest(int annualInterestRate,double savingBalance) {
		double interest=(savingBalance * (annualInterestRate/100.0))/12;
				this.savingBalance=savingBalance+annualInterestRate;
				
	}
	
	public void modifyInterest(double savingBalance) {
		System.out.println(annualInterestRate);
		double interest=(savingBalance * annualInterestRate/100.0)/12;
				this.savingBalance=savingBalance+annualInterestRate;
				
	}
	
	public static void modifyInterestRate(int newValue) {
		
		annualInterestRate=newValue;
		System.out.println(annualInterestRate);
	}
	public void showBalance() {
		System.out.println("balance"+savingBalance);
	}
	public static void main(String[] args) {
		
		SavingAccount sb1=new SavingAccount();
		SavingAccount sb2=new SavingAccount();
		sb1.calculateMonthlyInterest(4,5000);
		sb1.showBalance();
		sb2.calculateMonthlyInterest(4,6000);
		sb2.showBalance();
		sb1.modifyInterestRate(5);
		sb1.modifyInterest(5000);
		sb1.showBalance();
		sb1.modifyInterestRate(5);
		sb1.modifyInterest(6000);
		sb1.showBalance();
		}

}
