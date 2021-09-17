package com.sit.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.app.entity.Balances;

import com.sit.app.repository.BalanceRepository;
@Service
public class BalanceService {

	@Autowired
	private BalanceRepository balanceReposistory;
	
	public List<Balances> getBalance(String accountnumber) {
	 return balanceReposistory.findByAccountnumber(accountnumber);
	}

	

	public List<Balances> getAllBalances() {
		List<Balances> balances = new ArrayList<>();
		balanceReposistory.findAll().forEach(balances::add);
		return balances;
	}

}
