<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Article(s)</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Action</th>
			<th>Title</th>
			<th>Body</th>
			<th>Author</th>
		</tr>
		<c:forEach var="article" items="${articles}">
			<tr><c:out value=""/>
				<td>
					<a href="/DashboardApp/article/${article.id}">edit</a>&nbsp;
					<a href="/DashboardApp/article/delete/${article.id}">delete</a>
				</td>
				<td><c:out value="${article.title}"/></td>
				<td><c:out value="${article.text}"/></td>
				<td><c:out value="${article.author}"/></td>
			</tr>
		</c:forEach>		
	</table>
	<a href="/DashboardApp">Home Page</a>
</body>
</html>