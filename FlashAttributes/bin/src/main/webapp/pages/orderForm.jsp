<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="saveOrder" method="post" modelAttribute="order">
    <p>Name: <form:input path="productName" /></p>
    <p>Quantity: <form:input path="quantity" /></p>
    <input type="submit" value="Place Order">
</form:form>

</body>
</html>