<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<h1>New Bus Information Adding :</h1>
	<hr>
	<h3 style="color: green;">${msg}</h3>
	<hr>
	<br>
	<form:form action="busAdd" modelAttribute="busModel" method="post">
		<table>
			<tr>
				<td>businessName :</td>
				<td><form:input path="businessName" /></td>
			</tr>
			<tr>
				<td>associatedDate :</td>
				<td><form:input path="associatedDate" /></td>
			</tr>
			<tr>
				<td>businessContactnumber :</td>
				<td><form:input path="businessContactnumber" /></td>
			</tr>
			<tr>
				<td>businessEmailAddress :</td>
				<td><form:input path="businessEmailAddress" /></td>
			</tr>
			<tr>
				<td>status :</td>
				<td><form:input path="status" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>