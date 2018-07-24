package com.cg.payroll.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
@Controller
public class AssociateActionController {

	@Autowired
	private PayrollServices services;
	
	
	@RequestMapping(value="/registerAssociate")
	public ModelAndView registerCustomer(@Valid@ModelAttribute("associate")Associate associate, BindingResult result) {
		try {
			if(result.hasErrors())
				return new ModelAndView("RegistrationPage");
			
		associate=services.acceptAssociateDetails(associate);
		}catch (Exception e) {
			return new ModelAndView("ErrorPage");
		}
		return new ModelAndView("SuccessActionsPages", "associate", associate);
	}
	
	@RequestMapping(value="/getAssociate")
	public ModelAndView getCustomer(@RequestParam("associateID")int associateId) {
		Associate associate = new Associate();
		try {
		associate=services.getAssociateDetails(associateId);
		}catch (Exception e) {
			return new ModelAndView("ErrorPage");
		}
		return new ModelAndView("SuccessActionsPages", "associate", associate);
	}
	
	@RequestMapping(value="/showAllAssociates")
	public ModelAndView ShowTransactions() {
		List<Associate> associateList;
		
		ModelAndView model = new ModelAndView("AllAssociatesPage");
		
		try {
			associateList=services.getAllAssociatesDetails();
			model.addObject("allAssociates", associateList);
		
		}catch (Exception e) {
			return new ModelAndView("ErrorPage");
		}
		return model;
	}
}
