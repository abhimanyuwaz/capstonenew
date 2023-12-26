<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h1>Login </h1>

	<form method="post" action="/updatePassword">
		<fieldset>
			<legend> Update Password </legend>
			<br/>
			Enter the New Password :<input type="text" name="password"/> <br/><br/> 	
			<br/>
			<input type="submit" value="Submit" />
				
<br>

		</fieldset>

		
	</form>
</body>
</html>

