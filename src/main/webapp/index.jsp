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

	<s:url action="listEvents" var="listEvents">
	</s:url>

	<s:a href="%{listEvents}">List Events</s:a>


</body>
</html>