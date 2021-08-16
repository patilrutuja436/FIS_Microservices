package com.fis.account.bean;

public class Account {
	private String type;
	private long number;
	private double balance;
	public Account() {
		
	}
	public Account(long number,String type,double balance) {
		super();
		this.type=type;
		this.number=number;
		this.balance=balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [type=" + type + ", number=" + number + ", balance=" + balance + "]";
	}
	
}
