<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Sending json object</title>
<script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>
<body>
	<h2>Enter Employee Details</h2>
	<table>
		<tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" id="firstName"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" id="lastName"></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" id="age"></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><input type="text" id="salary"></td>
		</tr>
		<tr>
			<td ><input type="button" id="submit" value="Send Obj" onclick="sendData()"/></td>
			<td ><input type="button" id="submit" value="Send Obj List" onclick="sendDataList()"/></td>
		</tr>
	</table>
	
	<hr/>
	<div id="displayDiv" style="display:none"><h3>JSON Data from Controller</h3>
		<div id="processedData"></div>
	</div>
<script>

	function sendData(){

			var employeeData = {
			"id":document.getElementById('id').value,
			"firstName":document.getElementById('firstName').value,
			"lastName":document.getElementById('lastName').value,
			"age": document.getElementById('age').value,
			"salary":document.getElementById('salary').value
			
			};
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "postEmployee",
				data : JSON.stringify(employeeData),
				dataType : 'json',				
				success : function(dataobj) {
					$('#processedData').html(JSON.stringify(dataobj));
					$('#displayDiv').show();
				}
			});

		}

	function sendDataList(){

		var employeeData = [
		{
		"id":document.getElementById('id').value,
		"firstName":document.getElementById('firstName').value,
		"lastName":document.getElementById('lastName').value,
		"age": document.getElementById('age').value,
		"salary":document.getElementById('salary').value
		
		},
	    {
		"id":5,
		"firstName":"abc",
		"lastName":"abc",
		"age": 18,
		"salary":8
	    }
		];
		//alert("employeeData     "+JSON.stringify(employeeData));
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "employee",
			data : JSON.stringify(employeeData),
			//dataType : 'json',				
			success : function() {
				alert("JSON OBJ LIST SENT");
				

				
			}
		});

	}

	
 
 

</script>	
 
</body>
</html>