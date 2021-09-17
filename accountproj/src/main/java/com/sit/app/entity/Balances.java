package com.sit.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="balances")
public class Balances {
	@Id
	@Column(name="accountnumber")
	String accountnumber;
	@Column(name="lastupdatetimestamp")
	String lastUpdateTimestamp;
	@Column(name="balance")
	String balance;
	
	public Balances() {
		// TODO Auto-generated constructor stub
	}

	public Balances(String accountnumber, String lastUpdatedTimestamp, String balance) {
		super();
		this.accountnumber = accountnumber;
		this.lastUpdateTimestamp = lastUpdatedTimestamp;
		this.balance = balance;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getLastUpdatedTimestamp() {
		return lastUpdateTimestamp;
	}

	public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
		this.lastUpdateTimestamp = lastUpdatedTimestamp;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	
}
