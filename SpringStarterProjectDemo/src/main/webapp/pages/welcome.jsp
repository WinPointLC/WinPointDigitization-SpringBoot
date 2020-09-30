<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome ${name} have a great day
	${password}
	
	
	<jsp:useBean id="userProfile" class="com.example.demo.UserProfile" scope="session"></jsp:useBean>  
	<jsp:setProperty property="*" name="userProfile"/>  
	  
	<p> Accessed Data :  </p>
	<jsp:getProperty property="name" name="userProfile"/><br>  
	<jsp:getProperty property="password" name="userProfile"/><br>  
	<jsp:getProperty property="email" name="userProfile" /><br>  
	<jsp:getProperty property="userProfileList" name="userProfile" /><br>  
		
	
</body>
</html>