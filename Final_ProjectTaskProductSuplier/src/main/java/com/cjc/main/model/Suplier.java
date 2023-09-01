package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String supliername;
	private String supliercontact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupliername() {
		return supliername;
	}
	public void setSupliername(String supliername) {
		this.supliername = supliername;
	}
	public String getSupliercontact() {
		return supliercontact;
	}
	public void setSupliercontact(String supliercontact) {
		this.supliercontact = supliercontact;
	}
	
}
