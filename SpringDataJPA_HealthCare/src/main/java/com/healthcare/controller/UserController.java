package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.healthcare.entity.Admin;
import com.healthcare.entity.Login;
import com.healthcare.entity.User;
import com.healthcare.service.UserService;
/*
 * All Methods has been Tested via Post Man
 * 
 */


@Controller


/*
 * All Validation is Completed for user
 */
public class UserController 
{
	@Autowired 
	UserService userservice;
	@GetMapping("/")
	public String listProducts() 
	{
		return "Login";
	}
	
	@PostMapping("/adduser")
	
	public String addUser(@RequestBody User user)
	{
		return userservice.AddUser(user);
		
	}
	
	@PostMapping("/loginuser")
	public ModelAndView userLogin(@ModelAttribute Login login)		
	//public String userLogin()
	{
		System.out.println("Method Reached");
		System.out.println(" Username "+ login.getUsername() );
		System.out.println(" Password "+login.getPassword() );
	
	
	User user =userservice.getUsersByUserName(login.getUsername());
	
	ModelAndView mav;
	
	
	if(user.getUsername().equals("admin"))
	{
		if(user.getPassword().equals(login.getPassword()))
		{
			System.out.println("Logged in Successfully !!");
			 mav=new ModelAndView("index");
			 
		}
		else
		{
			mav=new ModelAndView("indexuser");	
		}
		
		
		
	
	}
	else
	{
		mav=new ModelAndView("indexuser");	
	}
	return mav;
	}
	
	
	
	@GetMapping("/getall")
	public List<User> getAllUser()
	{
		return userservice.getAllUsers();
		
	}
	
	@PutMapping("/updateuser")
	public String updateUser(@RequestBody User user) 
	{
		
	return userservice.updateUser(user);
		
	}
	
//	@DeleteMapping("deleteUser/{id}")
//	public String deleteUser(@PathVariable long id) 
//	{
//		return userservice.deleteUser(id);
//		
//	}
//	 
//	@GetMapping("get-user/{userid}")
//	public User getUser(@PathVariable long userid)
//	{
//		return userservice.getUserById(userid);
//	}
	

}
