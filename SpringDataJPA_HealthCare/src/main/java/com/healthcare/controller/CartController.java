package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.service.CartService;
import com.healthcare.service.ProductsService;
import com.healthcare.service.UserService;
import com.healthcare.entity.Cart;
import com.healthcare.entity.Product;
import com.healthcare.entity.User;
@RestController

/*
 * Testing is done for all the methods 
 * 
 */
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/cart")
public class CartController 
{
	/*
	 * Testing is done for all methods
	 */

	@Autowired 
	
	CartService cartservice;
	
//	@Autowired
//	UserService userservice;
//	@Autowired 
//	ProductsService productservice;
	
//	@GetMapping("/getall/{id}")
//	public List <Cart> getCart(@PathVariable long id)
//	{
//		return cartservice.getAllByUserCart(id);
//		
//	}
//	
//	@PostMapping("/add/{prodid}/{userid}")
//	public ResponseEntity<Cart> addCart(@PathVariable long  prodid,@PathVariable long userid )
//	{
//		
//		Product product=productservice.getProductById(prodid);
//		User user=userservice.getUserById(userid);
//		Cart cart= new Cart(user,product);
//		cart.setUnits(1);
//		
//		cart.setSumprice(cart.getUnits()*product.getPrice());
//		Cart addCart=cartservice.addCart(cart);
//		return new ResponseEntity<Cart>(addCart,HttpStatus.CREATED);
//				
//	}
	
	

//	@DeleteMapping("delete/{cartId}")
//	public ResponseEntity<?>deleteCart(@PathVariable long cartId)
//	{
//		cartservice.deleteCart(cartId);
//		return new ResponseEntity<>(HttpStatus.OK);
//		
//	}
//	@PutMapping("/update-cart/{cid}")
//	public void updateCart(@RequestBody Cart cart,@PathVariable long cid)
//	{
//		cartservice.updateCart(cart, cid);
//	}
	

	
	
}
