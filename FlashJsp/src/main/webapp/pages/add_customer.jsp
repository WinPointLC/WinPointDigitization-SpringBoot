<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>
<body>


<%-- <form:form action="saveCustomer" method="post" modelAttribute="customer">
    <p>First Name: <form:input path="firstName" /></p>
    <p>Last Name: <form:input path="lastName" /></p>
    <p>Country: <form:input path="address.country" /></p>
    <p>City: <form:input path="address.city" /></p>
    <p>Pin Code: <form:input path="address.pinCode" /></p>
 
     <input type="submit" value="Add Customer">
</form:form> --%>


<form:form id="CustomerForm" method="post" action="saveForm" modelAttribute="customer">
    <p>First Name: <form:input path="firstName" /></p>
    <p>Last Name: <form:input path="lastName" /></p>
    <p>Country: <form:input path="address.country" /></p>
    <p>City: <form:input path="address.city" /></p>
    <p>Pin Code: <form:input path="address.pinCode" /></p>
 
 		<form:form id="OrderForm" method="post" action="saveForm" modelAttribute="order">
		    <p>Product Name: <form:input path="productName" /></p>
		    <p>Quantity: <form:input path="quantity" /></p>		
		</form:form>
     
     <input type="button" value="Add Customer" onclick="submitForm()"/>
</form:form>

 
<%--  <form action="addCustomer" method="post">

	<spring:bind path="customer.firstName">
	   <input type="text"><br />
	</spring:bind>
	
	<spring:bind path="customer.lastName">
	   <input type="text"><br />
    </spring:bind>
	
	<spring:bind path="order.productName">
	   <input type="text" ><br />
    </spring:bind>
    
	<spring:bind path="order.quantity">
	   <input type="text"><br />
    </spring:bind>
	
	 <input type="submit" value="Add Customer">
</form> --%>

<script type="text/javascript">
	function submitForm(){
	   $('#CustomerForm').submit();
	   $('#OrderForm').submit();
	}
</script>


</body>
</html>