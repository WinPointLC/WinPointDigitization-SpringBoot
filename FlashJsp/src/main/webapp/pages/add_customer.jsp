<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="saveCustomer" method="post" modelAttribute="customer">
    <p>First Name: <form:input path="firstName" /></p>
    <p>Last Name: <form:input path="lastName" /></p>
    <input type="submit" value="Add Customer">
</form:form>

</body>
</html>