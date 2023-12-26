package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.entity.Wishlist;
import com.healthcare.service.WishlistService;
/*
 * 
 * Testing the Wish List 
 * 
 */
@RestController
@RequestMapping("/wishlist")
@CrossOrigin("http://localhost:4200/")
public class WishlistController 
{

	@Autowired
	WishlistService wishservice;
	
	@PostMapping("add/{uid}/{pid}")
	public Wishlist addWishlist(@PathVariable long uid,@PathVariable long pid)
	{
		Wishlist list= new Wishlist(uid,pid);
		return wishservice.addtowishlist(list);
		
	}
	@GetMapping("/getAll")
	public List<Wishlist> getAllWishlist()
	{
		return wishservice.getAllWishlist();
	}
	
	@GetMapping("/get-user-wishlist/{uid}")
	public List<Wishlist> getUserWishlist(@PathVariable long uid)
	{
		return wishservice.getAllDataWithSameUserId(uid);
	}
	@DeleteMapping("/delete/{uid}/{pid}")
	public String deleteData(@PathVariable long uid,@PathVariable long pid)
	{
		return wishservice.deleteByUserIdandProdId(uid, pid);
		
	}


}

