package com.cg.mywalletapp.service;

import java.math.BigDecimal;


import java.util.List;

import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.beans.Transactions;
import com.cg.mywalletapp.exception.InsufficientBalanceException;
import com.cg.mywalletapp.exception.InvalidInputException;


public interface WalletService
{
	public Customer createAccount(Customer customer);
	
	public Customer showBalance (String mobileNo);
	
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
	
	public Customer depositAmount (String mobileNo,BigDecimal amount );
	
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
	
	public List<Transactions> showTransaction(String mobileNo);

	boolean isValid(Customer customer) throws InvalidInputException,
			InsufficientBalanceException;
}
