<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>
<body>
	<font color="red">${errorMessage}</font>
	<form method="post">
		Name: <input type="text" name="name" id="name">
		Password: <input type="password" name="password" id="password">
		Email: <input type="text" name="email" id="email">
		<!-- Name1: <input type="text" name="name1">
		Password1: <input type="password" name="password1"> -->
		
		<input type="button" id="submit" value="Send Obj" onclick="sendData()"/>
<!-- 		<input type="submit">
 -->		
	</form>
	
	<script>
		function sendData(){
			alert("1");
			var userData = {
			"name":document.getElementById('name').value,
			"password":document.getElementById('password').value,
			"email":document.getElementById('email').value,
			};
			alert("UserData = "+userData);
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "/add-userProfile1",
				data : JSON.stringify(userData),
				dataType : 'json',				
				success : function(data) {
 					alert("Object sent successfully");
 					alert(data);
/*  					window.location.href = "welcome_user" + "?varid="+encodeURIComponent(JSON.stringify(data));
 */ 					
				}
			});
	
		}
		
	</script>
</body>
</html>