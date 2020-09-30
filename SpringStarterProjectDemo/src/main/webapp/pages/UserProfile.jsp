<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile.</title>
</head>
<body>

	<jsp:useBean id="userProfileId" class="com.demo.model.UserProfile" scope="session"></jsp:useBean>  
	<jsp:setProperty property="*" name="u"/>  
	  
	<jsp:getProperty property="name" name="name"/><br>  
	<jsp:getProperty property="password" name="password"/><br>  
	<jsp:getProperty property="email" name="email" /><br>  
	  

</body>
</html>