<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>
<body>


<p>Customer First Name: ${addedCustomer.firstName}</p>
<p>Customer Last Name: ${addedCustomer.lastName}</p>

<p>Country: ${addedCustomer.address.country}</p>
<p>City: ${addedCustomer.address.city}</p>
<p>Pin Code: ${addedCustomer.address.pinCode}</p>

<p>Product Name: ${addedOrder.productName}</p>
<p>Quantity: ${addedOrder.quantity}</p>

<script>

	function sendCustomer(){
		//alert("customer");
		var fname = '${addedCustomer.firstName}';
		//alert(fname);
		var lname = '${addedCustomer.lastName}';
		var country = '${addedCustomer.address.country}';
		var city = '${addedCustomer.address.city}';
		var pinc = '${addedCustomer.address.pinCode}';
		var address = {
				country: country,
				city: city,
				pinc: pinc
		}
		

		var customerData = {
			firstName: fname,
			lastName: lname,
			address: address
		};

		if (performance.navigation.type != performance.navigation.TYPE_RELOAD) {
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "/add-customer",
				data : JSON.stringify(customerData),
				dataType : 'json',				
				success : function(data)   {
						alert("Customer data sent");
						
					
					}
			});
		}
	}

	function sendOrder(){
		//alert("order");
		var prodName = '${addedOrder.productName}';
		var quant = '${addedOrder.quantity}';

		var orderData = {
			productName: prodName,
			quantity: quant
		}

		if (performance.navigation.type != performance.navigation.TYPE_RELOAD) {

			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "/add-order",
				data : JSON.stringify(orderData),
				dataType : 'json',				
				success : function(data)   {
						alert("Order data sent");
						
					
					}
			});
		}
	} 

	sendCustomer();
	sendOrder();
</script>

</body>
</html>