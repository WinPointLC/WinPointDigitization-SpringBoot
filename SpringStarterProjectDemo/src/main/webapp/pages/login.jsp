<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color="red">${errorMessage}</font>
	<form method="post">
		Name: <input type="text" name="name" id="name">
		Password: <input type="password" name="password" id="password">
		Email: <input type="text" name="email" id="email">
		Name1: <input type="text" name="name1">
		Password1: <input type="password" name="password1">
		
		<input type="button" id="submit" value="Send Obj" onclick="sendData()"/>
		<input type="submit">
		
	</form>
	
	<script>
		function sendData(){
	
			var userData = {
			"name":document.getElementById('name').value,
			"password":document.getElementById('password').value,
			"email":document.getElementById('email').value,
			};
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "add-userProfile",
				data : JSON.stringify(userData),
				//dataType : 'json',				
				success : function() {
					alert("Object sent successfully");
				}
			});
	
		}
	</script>
</body>
</html>