package com.parkwell;

import java.util.Objects;

public class Account {

	private String name; 
	private int accountNumber; 
	
	
	public Account() {} 
	
	public Account(String name, int accountNumber) {
		this.name = name; 
		this.accountNumber = accountNumber; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
