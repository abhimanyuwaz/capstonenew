package com.healthcare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.entity.Wishlist;
import com.healthcare.repository.WishlistRepository;

@Service
public class WishlistService {

	@Autowired
	WishlistRepository wishrepo;
	
	
	public Wishlist addtowishlist(Wishlist wish)
	{
	
		return wishrepo.save(wish);
		
	}
	
	public List <Wishlist> getAllWishlist()
	{
		return wishrepo.findAll();
		
	}
	
	public List<Wishlist> getAllDataWithSameUserId(long userid)
	{
		List <Wishlist> userProductList= new ArrayList<>();
		List <Wishlist> mainList=wishrepo.findAll();
		for(Wishlist a : mainList)
		{
			if(a.getUid()==userid)
			{
				userProductList.add(a);
			}
			
		}
		return userProductList;
		
		
	}
	public String deleteByUserIdandProdId(long uid, long pid)
	{
		List<Wishlist> userproductstodelete= new ArrayList<>();
		List<Wishlist> mainlist=wishrepo.findAll();
		
		
		for(Wishlist a: mainlist)
		{
			if(a.getUid()==uid&&a.getPid()==pid)
			{
				userproductstodelete.add(a);
				
			}
			
		}
		wishrepo.deleteInBatch(userproductstodelete);
		
		return "Data Deleted";
	}
}
