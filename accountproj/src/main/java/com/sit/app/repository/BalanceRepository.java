package com.sit.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sit.app.entity.Balances;

public interface BalanceRepository extends CrudRepository<Balances, String>{

	public List<Balances> findByAccountnumber(String accountnumber);

	

}
