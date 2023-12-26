package com.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.entity.Admin;
import com.healthcare.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminrepo;
	
	public String addAdmin(Admin admin)
	{
		
		adminrepo.save(admin);
		return "New Admin Saved";
	}
	
	public List<Admin> getAllAdmin()
	{
	
		return adminrepo.findAll();
	}
}
