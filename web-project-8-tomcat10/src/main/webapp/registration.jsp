<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration</title>
</head>
<body>
	<form action="Controller" method="post">
	
		<input type="hidden" name="command" value="forward" /> 
		<input type="hidden" name="operationType" value="registration" /> 
		
		Enter login:<br />
		<input type="text" name="login" value="" /><br /> 
		Enter name:<br />
		<input type="text" name="name" value="" /><br /> 
		Enter year of birth:<br />
		<input type="text"yearOfBirth" value="" /><br /> 
		Enter password:<br />
		<input type="password" name="password" value="" /><br /> <input
			type="submit" value="Отправить" /><br />
	</form>
</body>
</html>