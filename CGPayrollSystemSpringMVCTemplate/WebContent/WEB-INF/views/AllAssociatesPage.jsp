<%@page import="com.cg.payroll.controllers.AssociateActionController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.head {
background: aqua;
border: thin;
}
</style>
</head>
<body bgcolor="AFD4D5">
<div align="center">
	<div align="right" >
			<a href="">Menu Page</a>
		</div>
		
		<div align="center" class="head"><h1><font color="blue"> All Associate Details Are:</font></h1>
		<hr>
		</div>
		
		<table>
		<tr><th></th></tr>
		<c:forEach var="Associates" items="${allAssociates}">
		<tr>
		<td>First Name: </td>
		<td>Last Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		<td>First Name: </td>
		</tr>
		<tr>
		<td>${Associates.firstName}</td>
		<td>${Associates.lastName}</td>
		<td>First Name: ${Associates.department}</td>
		<td>First Name: ${Associates.designation}</td>
		<td>First Name: ${Associates.pancard}</td>
		<td>First Name: ${Associates.emailId}</td>
		<td>First Name: ${Associates.bankDetails.accountNumber}</td>
		<td>First Name: ${Associates.bankDetails.bankName}</td>
		<td>First Name: ${Associates.bankDetails.ifscCode}</td>
		<td>First Name: ${Associates.salary.basicSalary}</td>
		<td>First Name: ${Associates.salary.epf}</td>
		<td>First Name: ${Associates.salary.companyPf}</td>
		</tr>
		</c:forEach>
		</table>
		
	
       
</div>
</body>
</html>