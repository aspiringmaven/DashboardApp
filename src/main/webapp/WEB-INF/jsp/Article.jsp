<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Article Form</title>
</head>
<body>
<h1>Fill Form And Save</h1>
	<form:form modelAttribute="newArticle" method="POST" action="/DashboardApp/article">
		
		<form:hidden path="id"></form:hidden>
		
		<form:label path="title">Title : </form:label>
		<form:input path="title"/>
		
		<form:label path="text">Body : </form:label>
		<form:textarea path="text"/>
		
		<form:label  path="author">Author : </form:label>
		<form:input path="author"/>
		
		<input type="submit" value="Save Article"/>
		
	</form:form>
</body>
</html>