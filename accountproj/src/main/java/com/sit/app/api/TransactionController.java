package com.sit.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.app.entity.Balances;
import com.sit.app.entity.Transactions;
import com.sit.app.service.BalanceService;
import com.sit.app.service.TransactionService;


@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService ;
	
	 @RequestMapping(value = "/transactions")
	   public List<Transactions> getAllTransactions() 
	   {
			
		return transactionService.getAllTransactions();
	   }

	 @RequestMapping(value="/transactions/type/{type}")
	 public List<Transactions> getTransactionsByType(@PathVariable String type) {
			return transactionService.getTransactionsByType(type);
		}
	 
	 @RequestMapping(value="/transactions/{accountnumber}/{transactionts}")
	 public List<Transactions> getTransactionBetweenTime(@PathVariable String accountnumber, @PathVariable String transactionts){
		 return transactionService.getTransactionBetweenTime(accountnumber, transactionts);
	 }
		
	 @RequestMapping(value="/transactions/{accountnumber}/{type}/{transactionts}")
	 public List<Transactions> getTransactionBetweenTimetype(@PathVariable String accountnumber, @PathVariable String type, @PathVariable String transactionts){
		 return transactionService.getTransactionBetweenTimetype(accountnumber,type, transactionts);
	 }
	 
	 
	 
//		@GetMapping(value = "/idname/{id}/{name}")
//		public List<ProductDTO> findByIdAndName(@PathVariable("id")int id,@PathVariable("name")String name){
//			List<ProductDTO> productDTOs = productService.findByIdAndName(id, name+"%");
//			return productDTOs;
//		}
	

}
