<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewall"><h1>Generate Report</h1></a>
<s:form action="register">
	<s:textfield label="User Name" name="employee.uname"></s:textfield>
	<s:textfield label="User Email" name="employee.uemail"></s:textfield>
	<s:password label="Password" name="employee.upass"></s:password>
	<s:textfield label="User Designation" name="employee.udeg"></s:textfield>
	<s:submit value="Register"></s:submit>
</s:form>
</body>
</html>