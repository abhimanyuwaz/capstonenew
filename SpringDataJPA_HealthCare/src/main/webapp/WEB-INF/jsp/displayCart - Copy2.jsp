<!DOCTYPE html>
<html>
<!-- 	<head> -->
<!-- 		    Required meta tags -->
<!-- 		    <meta charset="utf-8"> -->
<!-- 		    <meta name="viewport" content="width=device-width, initial-scale=1"> -->
		
<!-- 			<link href="css/index.css" /> -->
<!-- 		    Bootstrap CSS -->
<!-- 		    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous"> -->
<!-- 		    <link href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" rel="stylesheet" > -->
	
<!-- 			<title>User - Cart</title> -->
<!-- 	</head> -->
<!-- 	<body class="bg-light"> -->
<!-- 		<div class="container"> -->
<!-- 			<p class="display-6"><strong>Cart</strong></p><br/> -->
<!-- 				<form action="/saveprodutcart" method="POST"> -->
			
<!-- 			<table class='display' id='medicineTablecart' style='width:100%'> -->
<!-- 			<thead> -->
<!-- 			<tr><th>Id</th><th>Name</th><th>Price</th><th>Category</th><th>Quantity</th><th>Add to Cart</th><th>Remove Form Cart</th><th>Qty in Cart</th>	 -->
<!-- 			</tr></thead><tbody> -->
				
<%-- 					<c:forEach items="${cart}" var="cart">     --%>
<!-- 					<tr>	 -->
<%-- 							<td>${cart.name}</td> --%>
<%-- <%-- 							 <input type="hidden" name="id" value="${data.id}" /></td> --%> --%>
							
<%-- 							 <td>${data.name}</td> --%>
<%-- <%-- 							 <input type="hidden" name="name" value="${data.name}" /></td> --%> --%>
							
<%-- 							<td>${data.price}</td> --%>
<%-- <%-- 							<input type="hidden" name="price" value="${data.price}" /></td> --%> --%>
							
<%-- 							<td>${data.category}</td> --%>
<%-- <%-- 							<input type="hidden" name="category" value="${data.category}" /></td> --%> --%>
							
<%-- 							<td>${data.quantity}</td> --%>
<%-- <%-- 							<input type="hidden" name="quantitynew" value="${data.quantity}" /></td> --%> --%>
							 
<%-- <%-- 							 <td><input class='btn btn-outline-primary'  value='Add' onclick='addToCart(${data.id})' /></td> --%> --%>
<%-- <%-- 							<td><input class='btn btn-outline-primary'  value='Remove' onclick='removefromCart(${data.id})' /></td> --%> --%>
<%-- <%-- 							<td  id='qty${data.id}' name="test" value='hello'>0</td> --%> --%>
<!-- <!-- 							<input type="hidden" name="quantity" id="cart"/> <br /> <br /> 	 --> -->
<%-- <%-- 							<input type="hidden" id='qty${data.id}' name="quantity" value=qty${data.id} />< --%> --%>
<%-- <%-- 							<id='qty${data.id}' name="quantity" value=>0</td> --%> --%>
						
<%-- <%-- 							<td><input type="hidden"  id='qty${data.id}'  name="quantity" />0</td> --%> --%>
<!-- 					</tr>	 -->
 
						
<!-- 		</c:forEach> -->

<!-- 		</tbody> -->
<!-- </table>	 -->




		
<%-- 		${cart.finalprice} --%>
<%-- 				${data.finalprice} --%>
				
				
<!-- 						<td>" + tagMap.get(medicine.getTagId()).getName() + "</td>"; -->
<!-- 						<td><input class='btn btn-outline-primary' type='submit' value='Add' onclick='addToCart("+medicineId+")' /></td>"; -->
<!-- 						<td><input class='btn btn-outline-primary' type='submit' value='Remove' onclick='removefromCart("+medicineId+")' /></td>"; -->
<!-- 						<td id='qty"+medicine.getId()+"'>"+cartQuantity+"</td>"; -->
<!-- 						<td id='finalAmount"+medicine.getId()+"'>"+(priceAfterOffer*cartQuantity)+"</td>"; -->
<!-- 					</tr> -->
						
<!-- 						totalAmount+=(priceAfterOffer*cartQuantity); -->
<!-- 					} -->
					
<!-- 					responseString += "</tbody></table>"; -->
<!-- 					out.print(responseString); -->

			
<!-- 				<br/> -->
<!-- 				<h3> -->
<%-- 					Total Amount : <b></b><span id="totalAmount"><% out.print("      " + totalAmount); %></span></b> --%>
<!-- 				</h3> -->
<!-- 				<br/> -->
<!-- 				<form action="PaymentGateway" method="post"> -->
<!-- 					<input type="hidden" name="cart" id="cart"/> <br /> <br /> 				 -->
<!-- 					<input class="btn btn-outline-primary" type="submit" value="Submit"/> -->
<!-- 				</form> -->
<!-- 		</div> -->
<!-- 	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script> -->
<!-- 		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script> -->
	    <script>
<%-- 	    	var cart=<%= cart %>; --%>
// 	    	$(document).ready(function(){
// 	    		cart['totalAmount']=parseInt($("#totalAmount").html());
// 	    		$("#cart").val(JSON.stringify(cart));
// 	    	});
// 	    	function addToCart(medicineId) {
// 		    	var currentQty = parseInt($("#qty"+medicineId).html());
// 		    	var priceAfterOffer = parseInt($("#priceAfterOffer"+medicineId).html());
// 		    	var totalAmountBefore = parseInt($("#totalAmount").html());
// 		    	var totalAmount = totalAmountBefore + priceAfterOffer;
// 		    	var newQty = currentQty+1;
// 		    	$("#qty"+medicineId).html(newQty);
// 		    	$("#finalAmount"+medicineId).html(newQty * priceAfterOffer);
// 		    	$("#totalAmount").html(totalAmount);
// 		    	cart['cart'][medicineId]=newQty;
// 		    	cart['totalAmount'] = totalAmount;
// 		    	$("#cart").val(JSON.stringify(cart));
// 		    }
// 		    function removefromCart(medicineId) {
// 		    	var currentQty = parseInt($("#qty"+medicineId).html());
// 		    	var priceAfterOffer = parseInt($("#priceAfterOffer"+medicineId).html());
// 		    	var newQty = Math.max(currentQty-1,0);
// 		    	var totalAmount = parseInt($("#totalAmount").html());
// 				$("#qty"+medicineId).html(newQty);
// 		    	$("#finalAmount"+medicineId).html(newQty * priceAfterOffer);
// 		    	if(currentQty>0){
// 		    		totalAmount = totalAmount - priceAfterOffer;
// 			    	$("#totalAmount").html(totalAmount);		    		
// 		    	}
// 				cart['cart'][medicineId]=newQty;
// 				cart['totalAmount'] = totalAmount;
// 		    	$("#cart").val(JSON.stringify(cart));
// 		    }
	    </script>
	</body>
</html>