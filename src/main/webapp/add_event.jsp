<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Event</h1>
	<s:form action="addEvent">
		<s:textfield name="ename" label="Event name" placeholder="Event name" />
		<s:textfield name="edate" label="Date" placeholder="dd/mm/yyyy"/>
		<s:submit />
	</s:form>
</body>
</html>