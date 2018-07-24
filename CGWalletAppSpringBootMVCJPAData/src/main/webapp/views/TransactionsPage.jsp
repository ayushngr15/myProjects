<%@page import="com.cg.mywalletapp.controllers.CustomerActionController"%>
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
			<a href="">LogOut</a>
		</div>
		
		<div align="center" class="head"><h1><font color="blue"> Your Transaction Details Are:</font></h1>
		<hr>
		</div>
		
		<table>
		<tr><th>Transactions</th></tr>
		<c:forEach var="Transactions" items="${transactions}">
		<tr>
		<td>${Transactions.transactionDetails}</td>
		</tr>
		</c:forEach>
		</table>
		
	
       
</div>
</body>
</html>