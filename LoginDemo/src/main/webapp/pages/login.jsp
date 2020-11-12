<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
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
		Username: <input type="text" name="username" id="username">
		Password: <input type="password" name="password" id="password">
		
		<input type="button" id="submit" value="Send Obj" onclick="sendData()"/>
<!-- 		<input type="submit">
 -->		
 	
 	
	</form>
	
	<script>
	
	
		function sendData(){
			
			var userData = {
			"username":document.getElementById('username').value,
			"password":document.getElementById('password').value
			
			};
			
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "/-user",
				data : JSON.stringify(userData),
				//dataType : 'json',				
				success : function()   {
 					alert("Us sent successfully");
 			
 				
 				}
			});
	
		}
		
	</script>
</body>
</html>