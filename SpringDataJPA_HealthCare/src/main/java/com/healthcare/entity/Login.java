package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	int id;
	


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private String password;
	
}
