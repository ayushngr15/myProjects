package com.cg.payroll.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.daoservices.PayrollDAOServices;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

@Component(value = "services")
public class PayrollServicesImpl implements PayrollServices {

	@Autowired
	PayrollDAOServices DAO;
	@Override
	public Associate acceptAssociateDetails(Associate associate) {
		
		return DAO.save(associate);
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailsNotFoundException {
		return 0;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailsNotFoundException {
		
		return DAO.findOne(associateId);
	}

	@Override
	public ArrayList<Associate> getAllAssociatesDetails() {
	
		return (ArrayList<Associate>)DAO.findAll();
	}

}
