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

<h4> Purchase Details  </h4>
<table style="width:40%">
        <tr>
          
            <th>Purchase Date</th>
            <th>User First Name </th>
            <th>User Last Name</th>
          	<th>Product Name</th>
          	<th>Product Category</th>    
          
     
          
        </tr>
        
         <c:forEach items="${purchasereport}" var="data">        
        <tr>	
			 <td>${data.purchaseDate}</td>
			
            <td>${data.users.firstname}</td>
            <td>${data.users.lastname}</td>
            <td>${data.product.name}</td>
            <td>${data.product.category.categoryname}</td>
           
            
<%--                    <c:forEach items="${purchasereport}" var="pdata">    --%>
<%--              <td>${pdata.product.name}</td> --%>
<%--                </c:forEach> --%>
               
<%--               <td>${data.product.categoryname}</td> --%>
               <td>
                
            </td>
	
        </tr>
       </c:forEach>
    </table>
</div>   
</body>
</html>