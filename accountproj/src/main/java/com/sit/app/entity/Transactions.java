package com.sit.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
	@Id
	@Column(name="accountnumber")
	String accountnumber;
	@Column(name="transactionts")
	String transactionts;
	@Column(name="type")
	String type;
	@Column(name="amount")
	String amount;
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}

	public Transactions(String accountnumber, String transactionts, String type, String amount) {
		super();
		this.accountnumber = accountnumber;
		this.transactionts = transactionts;
		this.type = type;
		this.amount = amount;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getTransactionts() {
		return transactionts;
	}

	public void setTransactionts(String transactionts) {
		this.transactionts = transactionts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
