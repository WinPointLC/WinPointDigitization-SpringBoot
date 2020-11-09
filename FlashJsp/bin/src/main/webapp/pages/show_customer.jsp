<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>
<body>


<p>Customer First Name: ${addedCustomer.firstName}</p>
<p>Customer Last Name: ${addedCustomer.lastName}</p>

<script>
	var fname = '${addedCustomer.firstName}';
	//alert(fname);
	var lname = '${addedCustomer.lastName}';

	var userData = {
		firstName: fname,
		lastName: lname
	};

	if (performance.navigation.type != performance.navigation.TYPE_RELOAD) {
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/add-user",
			data : JSON.stringify(userData),
			dataType : 'json',				
			success : function(data)   {
					alert("Customer data sent");
					
				
				}
		});
	} 

	
	

</script>

</body>
</html>