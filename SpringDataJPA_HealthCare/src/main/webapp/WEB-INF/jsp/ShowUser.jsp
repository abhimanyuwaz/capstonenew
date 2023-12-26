<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Insert title here</title>
</head>


<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

<h4> User List  </h4>

<table style="width:40%">
  <tr>
    <th>First Name</th>
    <th>Last Name </th>
    
  </tr>

        <c:forEach items="${users}" var="data">
        <tr>
            <td>${data.firstname}</td>
            <td>${data.lastname}</td>
     
        </tr>
        </c:forEach>
</table>



</body>
</html>