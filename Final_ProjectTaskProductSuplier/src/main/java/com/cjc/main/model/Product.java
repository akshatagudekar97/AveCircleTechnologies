package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String productname;
	private String productprice;
	
	@ManyToOne(cascade=CascadeType.MERGE.PERSIST)
	private Suplier s;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public Suplier getS() {
		return s;
	}

	public void setS(Suplier s) {
		this.s = s;
	}
	
	
	
}
