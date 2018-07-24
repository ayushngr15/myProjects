package com.cg.payroll.beans;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Associate")
public class Associate implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int associateID;
	
	private int yearlyInvestmentUnder80C;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String department;
	@NotEmpty
	private String designation;
	@NotEmpty
	private String pancard;
	@NotEmpty
	private String emailId;
	@Embedded
	private BankDetails bankDetails ;
	@Embedded
	private Salary salary;
	
	
	public Associate() {
		
	}


	public Associate(String firstName, String lastName, String department, String designation, String pancard,
			String emailId, BankDetails bankDetails, Salary salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankDetails = bankDetails;
		this.salary = salary;
	}


	public int getYearlyInvestmentUnder80C() {
		return yearlyInvestmentUnder80C;
	}


	public void setYearlyInvestmentUnder80C(int yearlyInvestmentUnder80C) {
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAssociateID() {
		return associateID;
	}



	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getPancard() {
		return pancard;
	}


	public void setPancard(String pancard) {
		this.pancard = pancard;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public BankDetails getBankDetails() {
		return bankDetails;
	}


	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associateID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associate other = (Associate) obj;
		if (associateID != other.associateID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Associate [associateID=" + associateID + ", yearlyInvestmentUnder80C=" + yearlyInvestmentUnder80C
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + ", pancard=" + pancard + ", emailId=" + emailId + ", bankDetails="
				+ bankDetails + ", salary=" + salary + "]";
	}
	
	
}

