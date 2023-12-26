 package com.healthcare.service;
 
 import com.healthcare.entity.Cart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.repository.CartRepository;

@Service
public class CartService 
{
	@Autowired
	
	CartRepository cartrepo;
	
	
	public String addCart(Cart cart) 
	{
		cartrepo.save(cart);
		return "Cart Added";
		
	}
	public String addCartBulk(ArrayList<Cart> cart) 
	{
		for(int i=0;i<cart.size();i++)
		{
			
			cartrepo.save(cart.get(i));	
		}
		return "Cart Added";
		
	}
	
	public List<Cart> getAllProducts()
	{
		return cartrepo.findAll();
		
	}
	
	public String deleteProduct(long id)
	{
		cartrepo.deleteById(id);
		return "Product is Deleted";
		
	}
//	public List<Cart> getAllByUserCart(long id)
//	{
//		return cartrepo.findAllByUserId(id);
//	
//	}
//	
//	public void deleteCart(long id)
//	{	
//		cartrepo.deleteById(id);		
//	}
//
//	public Cart addCart(Cart cart)
//	{
//		return	cartrepo.save(cart);
//		 
//	}
//	
//	public void updateCart(Cart cart,long id)
//	{
//		Cart updatedcart=cartrepo.findById(id).get();
//		updatedcart=cart;
//		cartrepo.save(updatedcart);
//		
//	}
	
	
}
