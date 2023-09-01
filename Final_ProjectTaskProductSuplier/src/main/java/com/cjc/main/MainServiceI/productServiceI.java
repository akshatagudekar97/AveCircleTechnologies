package com.cjc.main.MainServiceI;

import java.util.List;

import com.cjc.main.model.Product;

public interface productServiceI {

	public void saveproduct(Product p);
	public List<Product> getproduct();
	public void deletepro(Product p);
	public List<Product> searchproduct(String productname);

}
