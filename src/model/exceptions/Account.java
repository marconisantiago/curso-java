package model.exceptions;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawlimit;

	public Account(Integer number, String holder, Double balance,
			Double withdrawlimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimit = withdrawlimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawlimit() {
		return withdrawlimit;
	}

	public void setWithdrawlimit(Double withdrawlimit) {
		this.withdrawlimit = withdrawlimit;
	}

	//public void deposit(double amount) {
		//balance += amount;

//	}

	public void withdraw(double amount){
		if (amount > balance) {
			throw new DomainException("Not enough balance");

		}

		if (amount > withdrawlimit) {
			throw new DomainException(
					"The amout exceeds withdraw limit");

		} else {
			balance -= amount;
		}
		
	
	}

}
