package com.syntax.class16;

public class Account {
private String userName;
private String password;
private String name;
private String adress;
private double AccountBalance=12000;

public void setUserName(String AccountuserName) {
	if (AccountuserName.length()<16) {
		userName=AccountuserName;
	}else {
		System.out.println("invalid user name");
	}
}
	
	public void setPassword(String AccountPass) {

		if(AccountPass.length()<10){
			password=AccountPass;
		}else {
			System.out.println("invalid password");
		}
}
public void getBalance(String AccountuserName, String Accountpassword) {

		if(userName.equals(AccountuserName) && password.equals(Accountpassword)){
			System.out.println(AccountBalance);
		}else {
			System.out.println("incorrect username or password");
		}
}
}

