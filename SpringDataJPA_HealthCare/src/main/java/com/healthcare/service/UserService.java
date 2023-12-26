package com.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.entity.User;
import com.healthcare.repository.UserRepository;

@Service
public class UserService 
{

	@Autowired
	private UserRepository userrepo;
	
	public String AddUser(User user)
	{
		userrepo.save(user);
		return "User added";
	}
	
	public List<User> getAllUsers()
	{
		return userrepo.findAll();
		 
	}
	
	public User getUsersByUserName(String username)
	{
		 List <User> allusers=userrepo.findAll();
		 for ( int i=0; i<allusers.size();i++)
		 {
			 User user=(User)allusers.get(i);
			 if(user.getUsername().equals(username))
			 {
				 return user;
			 }
			 
			 
		 }
			return null;	 
				 

		 
	}
	
	public String  updateUser(User user)
	{
		userrepo.save(user);
		return "User is Udpated";
	}
	public String  deleteUser(long id)
	{
		userrepo.deleteById(id);
		return "User id Deleted";
	}
	public User getUserById(Long id)
	{
		return userrepo.findById(id).get();
		
	}
	
	
	
}
