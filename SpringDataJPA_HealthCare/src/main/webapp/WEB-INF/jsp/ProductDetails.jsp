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




<h4> Medicine Details  </h4>
<table style="width:40%">
        <tr>
      
            <th>Name</th>
            <th>Price</th>
            <th>Category Name</th>
            <th>Quantity</th>
          
            <th>Action</th>
          
        </tr>
        
         <c:forEach items="${product}" var="data">        
        <tr>	
			 <td>${data.name}</td>
			
            <td>${data.price}</td>
            
               <td>${data.category}</td>
               <td>${data.quantity}</td>
               <td>
                <a href="/editproduct?id=${data.id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/deleteproduct?id=${data.id}">Delete</a>
            </td>
	
        </tr>
       </c:forEach>
    </table>
</div>   
</body>
</html>