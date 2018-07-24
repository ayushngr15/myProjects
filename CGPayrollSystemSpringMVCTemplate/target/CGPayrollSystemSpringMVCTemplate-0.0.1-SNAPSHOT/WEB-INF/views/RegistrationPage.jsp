<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
.head {
background: aqua;
border: thin;
}
</style>
</head>
<body bgcolor="AFD4D5">
	<div align="center" class="head">
		<h1><font color="blue">Welcome to Payroll Registration Page</font></h1>
	<hr/>
	</div>
 
	<table>
		<form:form action="registerAssociate" method="post"
			modelAttribute="associate">

			<tr>
				<td>Enter First Name :</td>
				<td><form:input path="firstName" size="20" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>

            <tr>
				<td>Enter Last Name :</td>
				<td><form:input path="lastName" size="20" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Department Name :</td>
				<td><form:input path="department" size="20" /></td>
				<td><form:errors path="department" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Designation :</td>
				<td><form:input path="designation" size="20" /></td>
				<td><form:errors path="designation" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter PAN Card Number :</td>
				<td><form:input path="pancard" size="10" /></td>
				<td><form:errors path="pancard" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Email Id :</td>
				<td><form:input path="emailId" size="20" /></td>
				<td><form:errors path="emailId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Bank Account Number :</td>
				<td><form:input path="bankDetails.accountNumber" size="5" /></td>
				<td><form:errors path="bankDetails.accountNumber" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Bank Name :</td>
				<td><form:input path="bankDetails.bankName" size="20" /></td>
				<td><form:errors path="bankDetails.bankName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Bank IFSC Code :</td>
				<td><form:input path="bankDetails.ifscCode" size="20" /></td>
				<td><form:errors path="bankDetails.ifscCode" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Basic Salary :</td>
				<td><form:input path="salary.basicSalary" size="5" /></td>
				<td><form:errors path="salary.basicSalary" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter EPF :</td>
				<td><form:input path="salary.epf" size="5" /></td>
				<td><form:errors path="salary.epf" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Company PF :</td>
				<td><form:input path="salary.companyPf" size="5" /></td>
				<td><form:errors path="salary.companyPf" cssClass="error" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="REGISTER" /></td>
				<td></td>
			</tr>
		</form:form>
	</table>
</body>
</html>