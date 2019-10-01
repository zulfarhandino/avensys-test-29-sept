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
	<s:a href="add_event.jsp">Add Event</s:a>
	<table>
		<tr>
			<th>No.</th>
			<th>Event Name</th>
			<th>Date</th>
		</tr>
		<s:iterator status="stat" value="elist">
			<s:url action="deleteEvent" var="deleteEvent">
				<s:param name="id">
					<s:property value="id" />
				</s:param>
			</s:url>
			<tr>
				<td><s:property value="#stat.count" /></td>
				<td><s:property value="ename" /></td>
				<td><s:property value="edate" /></td>
				<td><s:a href="%{deleteEvent}">Delete</s:a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>