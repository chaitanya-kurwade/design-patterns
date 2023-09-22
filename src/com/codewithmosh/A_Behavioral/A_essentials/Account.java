package com.codewithmosh.A_Behavioral.A_essentials;

public class Account {

	//encapsulation
	private float balance;
	
	
	public void deposite(float amount) {
		if(amount>0)
			this.balance += amount;
	}
	
	public void withdraw(float amount) {
		if (balance > 0) {
			this.balance -= amount;
		}
	}
	
	public void setBalance(float balance) {
		if (balance>0) {
			this.balance = balance;
		}
	}
	
	public float getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		// Encapsulation example 
		Account account = new Account();
		account.deposite(10);
		account.withdraw(5);
		System.out.println(account.getBalance());
	}
	
}
