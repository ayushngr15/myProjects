package com.cg.mywalletapp.controllers;

import java.math.BigDecimal;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.beans.Transactions;
import com.cg.mywalletapp.service.WalletService;





@Controller
public class CustomerActionController {
	
	@Autowired
	private WalletService walletService;

	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid@ModelAttribute("customer")Customer customer, BindingResult result) {
		try {
			if(result.hasErrors())
				return new ModelAndView("RegistrationPage");
			
		customer=walletService.createAccount(customer);
		}catch (com.cg.mywalletapp.exception.InvalidInputException e) {
			return new ModelAndView("ErrorPage");
		}
		return new ModelAndView("SuccessActionsPages", "customer", customer);
	}
	
	@RequestMapping(value="/getCustomer")
	public ModelAndView getCustomer(@RequestParam("mobileNo")String mobileNo) {
		Customer customer = new Customer();
		try {
		customer=walletService.showBalance(mobileNo);
		}catch (Exception e) {
			return new ModelAndView("ErrorPage");
		}
		return new ModelAndView("SuccessActionsPages", "customer", customer);
	}
	
	@RequestMapping(value="/deposit")
	public ModelAndView deposit(@RequestParam("mobileNo")String mobileNo, @RequestParam("amount")BigDecimal amount) {
		Customer customer = new Customer();
		try {
		customer=walletService.depositAmount(mobileNo, amount);
		}catch (Exception e) {
			return new ModelAndView("DepositPage");
		}
		return new ModelAndView("SuccessActionsPages", "customer", customer);
	}
	
	@RequestMapping(value="/withdraw")
	public ModelAndView withraw(@RequestParam("mobileNo")String mobileNo, @RequestParam("amount")BigDecimal amount) {
		Customer customer = new Customer();
    try {
		customer=walletService.withdrawAmount(mobileNo, amount);
		}catch (Exception e) {
			return new ModelAndView("WithdrawPage");
		}
		return new ModelAndView("SuccessActionsPages", "customer", customer);
	}
	
	@RequestMapping(value="/fundTransfer")
	public ModelAndView FundTransfer(@RequestParam("mobileNo1")String sourceMobileNo,@RequestParam("mobileNo2")String targetMobileNo, @RequestParam("amount")BigDecimal amount) {
		Customer customer = new Customer();
		try {
		customer=walletService.fundTransfer(sourceMobileNo, targetMobileNo, amount);
		}catch (Exception e) {
			return new ModelAndView("FundTransferPage");
		}
		return new ModelAndView("SuccessActionsPages", "customer", customer);
	}
	
	
	@RequestMapping(value="/showTransactions")
	public ModelAndView ShowTransactions(@RequestParam("mobileNo")String mobileNo) {
		List<Transactions> transactionList;
		
		ModelAndView model = new ModelAndView("TransactionsPage");
		model = new ModelAndView("TransactionsPage");
		
		
		try {
			transactionList=walletService.showTransaction(mobileNo);
			model.addObject("transactions", transactionList);
		
		}catch (Exception e) {
			return new ModelAndView("ErrorPage");
		}
		return model;
	}
}

