package com.healthcare.entity;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 * @author waz78153
 *
 */
@Entity
public class CartInput {

	@Id
	@GeneratedValue
	int id;
	double totalprice;
	String medicineordered;	
	private String mesage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getMedicineordered() {
		return medicineordered;
	}
	public void setMedicineordered(String medicineordered) {
		this.medicineordered = medicineordered;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	
	
}

