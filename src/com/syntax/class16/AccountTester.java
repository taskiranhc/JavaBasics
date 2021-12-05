package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
		Account account1=new Account();
		// account1.balance=12000; it is not allowed
		account1.setUserName("Ceyhun");
		account1.setPassword("pass123");
		account1.getBalance("Ceyhun","pass123");
	}

}
