</html>
<head>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Insert title here</title>


		    <!-- Required meta tags -->
		    <meta charset="utf-8">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		
			<link href="css/index.css" />
		    <!-- Bootstrap CSS -->
		    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
		    <link href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" rel="stylesheet" >
	
			<title> Final Cart </title>
			   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
		<script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
	    <script>
	    	var cart={};
		    $(document).ready(function() {
		        $('#medicineTable').DataTable();
		        
		    });
// 		    function addToCart(medicineId) {
// 		    	var currentQty = parseInt($("#qty"+medicineId).html());
// 		    	var newQty = currentQty+1;
// 		    	$("#qty"+medicineId).html(newQty);
// 		    	cart[medicineId]=newQty;
// 		    	$("#cart").val(JSON.stringify({cart:cart}));
// 		    }
// 		    function removefromCart(medicineId) 
// 		    {
// 		    	var currentQty = parseInt($("#qty"+medicineId).html());
// 		    	var newQty = Math.max(currentQty-1,0);
// 		    	$("#qty"+medicineId).html(newQty);
// 		    	cart[medicineId]=newQty;
// 		    	$("#cart").val(JSON.stringify({cart:cart}));
// 		    }
	    </script>
	</head>
	<body class="bg-light">
		<div class="container">
			<p class="display-6"><strong> Medicines Order</strong></p><br/>
			<form action="confirmorder" method="POST">
			
			<table class='display' id='medicineTable' style='width:100%'>
			<thead>
			<tr><th>Id</th><th>Name</th><th>Price</th><th>Category</th><th>Qty in Cart</th><th>Final Price</th>	
			</tr></thead><tbody>
			
			<c:forEach items="${cart}" var="cart">    
					<tr>	
							<td>${cart.id}</td>
							 <input type="hidden" name="id" value="${cart.id}" /></td>
							
							 <td>${cart.name}</td>
							 <input type="hidden" name="name" value="${cart.name}" /></td>
							
							<td>${cart.price}</td>
							<input type="hidden" name="price" value="${cart.price}" /></td>
							
							<td>${cart.category}</td>
							<input type="hidden" name="category" value="${cart.category}" /></td>
							
							<td>${cart.quantity}</td>
							<input type="hidden" name="quantitynew" value="${cart.quantity}" /></td>
							 <td>${cart.finalprice}</td>
							<input type="hidden" name="price" value="${cart.finalprice}" /></td>
							
<%-- 							 <td><input class='btn btn-outline-primary'  value='Add' onclick='addToCart(${cart.id})' /></td> --%>
<%-- 							<td><input class='btn btn-outline-primary'  value='Remove' onclick='removefromCart(${cart.id})' /></td> --%>
<%-- 							<td  id='qty${cart.id}' name="test" value='hello'>0</td> --%>
<!-- 							<input type="hidden" name="quantity" id="cart"/> <br /> <br /> 	 -->
<%-- 							<input type="hidden" id='qty${data.id}' name="quantity" value=qty${data.id} />< --%>
<%-- 							<id='qty${data.id}' name="quantity" value=>0</td> --%>
						
<%-- 							<td><input type="hidden"  id='qty${data.id}'  name="quantity" />0</td> --%>
					</tr>	
 
					
		</c:forEach>
		 
									
			</tbody></table>	
			<br>
			<br>
			
<label for="cars">Payment Method</label>

<select name="cars" id="cars">
  <option value="volvo">Credit Card </option>
  <option value="saab">COD</option>
  <option value="mercedes">Intenet Banking</option>

</select>
<br>
<br>
			<input class="btn btn-outline-primary" type="submit" value="Confirm Order"></td>					
			 </form>
			 			
				<br/><br/>
	
				<form action="DisplayCart" method="post">
					<input type="hidden" name="cart" id="cart"/> <br /> <br /> 	
								
<!-- 					<input class="btn btn-outline-primary" type="submit" value="Submit"/> -->
				</form>
		</div>
	 
	</body>
</html>