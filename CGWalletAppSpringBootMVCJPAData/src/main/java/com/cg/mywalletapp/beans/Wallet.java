package com.cg.mywalletapp.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Embeddable
public class Wallet implements Serializable  
{
	
	
	@NotEmpty
	private BigDecimal balance;

	
	
	public Wallet() {
		
	}

	

	public Wallet(BigDecimal balance) {
		this.balance=balance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	

	@Override
		public String toString() {
		return ", balance="+balance;
	}
}
