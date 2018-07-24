<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div >
		<div align="right">
			<a href="">SignOut</a>
		</div>
		<div align="center" class="head">
		<h2><font color="green" ><marquee direction="right"> Welcome</marquee></font></h2>
			<h4>Associate ID: ${associate.associateId }</h4>
			<h4>First Name: ${associate.firstName }</h4>
			<h4>Last Name: ${associate.lastName }</h4>
			<h4>Department Name: ${associate.department }</h4>
			<h4>Designation: ${associate.designation }</h4>
			<h4>PAN Card Number: ${associate.pancard }</h4>
			<h4>Email ID: ${associate.bankDetails.accountNumber }</h4>
			<h4>Email ID: ${associate.bankDetails.bankName }</h4>
			<h4>Email ID: ${associate.bankDetails.ifscCode }</h4>
			<h4>Email ID: ${associate.salary.basicSalary }</h4>
			<h4>Email ID: ${associate.salary.epf }</h4>
			<h4>Email ID: ${associate.salary.companyPf }</h4>
		<hr />
		</div>
		
		
	</div>
</body>
</html>