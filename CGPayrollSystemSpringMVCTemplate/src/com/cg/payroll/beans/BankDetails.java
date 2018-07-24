package com.cg.payroll.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class BankDetails implements Serializable{
	
	private int accountNumber;
	@NotEmpty
	private String bankName;
	@NotEmpty
	private String ifscCode;
	
	
	
	public BankDetails() {
		
	}



	public BankDetails(int accountNumber, String bankName, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public String getIfscCode() {
		return ifscCode;
	}



	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}



	@Override
	public String toString() {
		return "BankDetails [accountNumber=" + accountNumber + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ "]";
	}
	
	
	
}
