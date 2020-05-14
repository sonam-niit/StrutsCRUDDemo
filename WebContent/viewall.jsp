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
<table border=1 cellspacing=0 cellpadding=10>
<s:iterator value="list">
<tr>
<td><s:property value="uname"/></td>
<td><s:property value="uemail"/> </td>
<td><s:property value="udeg"/></td>
<td><a href="update?email=<s:property value="uemail"/>">Update</a></td>
<td><a href="delete?email=<s:property value="uemail"/>">Update</a></td>
</tr>
</s:iterator>
</table>

<s:property  value="message"/>
</body>
</html>