package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Wishlist 
{
	@Id
	@GeneratedValue
	private long wid;
	private long uid;
	private long pid;
	public long getWid() 
	{
		return wid;
	}
	public void setWid(long wid) {
		this.wid = wid;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}	
	
	public Wishlist(long uid, long pid) {
		super();
		this.uid = uid;
		this.pid = pid;
	}
	public Wishlist()
	{
		
	}
}
