package com.sit.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sit.app.entity.Transactions;
import com.sit.app.repository.TransactionRepository;


@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	public List<Transactions> getAllTransactions() {
		List<Transactions> transactions = new ArrayList<>();
		transactionRepository.findAll().forEach(transactions::add);
		return transactions;
	}

	public List<Transactions> getTransactionsByType(String type) {
		return transactionRepository.findByTransactionType(type);
	}

	public List<Transactions> getTransactionBetweenTime(String accountnumber, String transactionts) {
		return transactionRepository.findByTransactionTime(accountnumber,transactionts);
	}
	public List<Transactions> getTransactionBetweenTimetype(String accountnumber,  String type, String transactionts) {
		return transactionRepository.findByTransactionTimetype(accountnumber,type,transactionts);
	}
	
	

}
