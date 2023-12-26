package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin 
{

	@Id
	@GeneratedValue
	private long id;
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	private String email;
	private String password;
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
