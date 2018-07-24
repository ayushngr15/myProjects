package com.cg.payroll.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.payroll.beans.Associate;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getIndexPage() {
		return "IndexPage";
	}
	
	@RequestMapping(value="/Registration")
	public String getRegistrationPage() {
		return "RegistrationPage";
	}
	@RequestMapping(value="/Login")
	public String getLoginPage() {
		return "LoginPage";
	}
	
	
	@ModelAttribute("associate")
	public Associate getAssociate() {
		return new Associate();
		
	}
	@ModelAttribute("allAssociates")
	public List<Associate> getAssociates() {
		return new ArrayList<Associate>();
		
	}
}
