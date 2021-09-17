package com.sit.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sit.app.entity.Transactions;

public interface TransactionRepository extends CrudRepository<Transactions, String> {

	@Query("select u from #{#entityName} u where u.type = ?1")
	public List<Transactions> findByTransactionType(String type);
	
	@Query("select u from  #{#entityName} u where u.accountnumber = ?1 and u.transactionts Like ?2%")
	public List<Transactions> findByTransactionTime(String accountnumber, String transactionts);
	
	@Query("select u from  #{#entityName} u where u.accountnumber = ?1 and u.type = ?2 and u.transactionts Like ?3% ")
	public List<Transactions> findByTransactionTimetype(String accountnumber,String type, String transactionts );

	
}
