package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.healthcare.entity.Admin;
import com.healthcare.entity.Login;
import com.healthcare.service.AdminService;

/*
 * Testing Completed Via Postman
 */
@Controller
//@RequestMapping("/admin")
//@CrossOrigin("http://localhost:4200/")
public class AdminController 
{

	@Autowired
	AdminService adminservice;
	
	@PostMapping("/add-admin")
	public String addAdmin(@RequestBody Admin admin)
	{
		return adminservice.addAdmin(admin);
	}
//	@GetMapping("getAll")
//	public List <Admin> getAllAdmin()
//	{
//		
//		return adminservice.getAllAdmin();
//	
//	
//	}
//	
//	@PostMapping("/loginusaser")
//	public ModelAndView userLogin(@ModelAttribute Login login)		
//	//public String userLogin()
//	{
//		System.out.println("Method Reached");
//	System.out.println(" Username "+ login.getUsername() );
//	System.out.println(" Password "+login.getPassword() );
//	
	
//	Admin adminuser =adminservice.findUserByUserName(login.getUsername());
//	
//	ModelAndView mav;
//	
//	
//	if(user.getUserName().equals("admin"))
//	{
//		if(user.getPassWord().equals(login.getPassword()))
//		{
//			System.out.println("Logged in Successfully !!");
//			 mav=new ModelAndView("index");
//			 
//		}
//		
//		
//		else
//		{
//			mav=new ModelAndView("Login");	
//		}
//		
//		
//	
//	}
//	else
//	{
//		mav=new ModelAndView("Login");
//	}
//	return mav;
//	}
//	
	
	@GetMapping("test")
	public String TestgetAllAdmin()
	{
		
		return "adminlogin";
	
	}
	
}
