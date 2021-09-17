package com.sit.app.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.app.entity.Balances;
import com.sit.app.service.BalanceService;

@RestController
public class BalanceController {
	
	@Autowired
	private BalanceService balanceService;

	 @RequestMapping(value = "/balances")
	   public List<Balances> getAllBalances() 
	   {
			
		return balanceService.getAllBalances();
	   }
	
	@RequestMapping(value="/balances/{accountnumber}")
	public List<Balances> getBalance(@PathVariable String accountnumber) {
		return balanceService.getBalance(accountnumber);
	}
	
}
