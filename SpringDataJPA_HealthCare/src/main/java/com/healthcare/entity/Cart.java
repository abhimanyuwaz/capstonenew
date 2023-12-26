package com.healthcare.entity;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Cart {

	@Id
	@GeneratedValue
	int id;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private String name;
	private double price;
	private String url;
	private String category;
	private int quantity;
	 double finalprice;
	int productid;

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public  double getFinalprice() {
		return finalprice;
	}
	public  void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	public void setId(int id) {
		this.id = id;
	}
}

