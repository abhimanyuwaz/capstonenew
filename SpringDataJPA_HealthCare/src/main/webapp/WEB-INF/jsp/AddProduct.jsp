<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Insert title here</title>

<body>
	
	<form action="/AddNewProduct" method="post">
	<nav>
	
	
			<h4> Product Name :  </h4>  <input type="text"     name="name"/><br/>
			<h4> Price:  </h4>  <input type="text"     name="price"/><br/>
			<h4> Category:  </h4>  <input type="text"     name="category"/><br/>
			<h4> Quantity:  </h4>  <input type="text"     name="quantity"/><br/>
					
			</br>
			<button type="submit" > Submit  </button>
	
			
	</nav>
	<form>
</fieldset>
</body>
</html>