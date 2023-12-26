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

	<form method="post" action="/loginuser">
		<fieldset>
			<legend>Login Page</legend>

			<br/>
			Username:<input type="text" name="username"/> <br/><br/> 
			Password:<input type="password" name="password"/> <br/><br/> 
			
			<br/>
			<input type="submit" value="Login" />
				
<br>

		</fieldset>

		
	</form>
</body>
</html>