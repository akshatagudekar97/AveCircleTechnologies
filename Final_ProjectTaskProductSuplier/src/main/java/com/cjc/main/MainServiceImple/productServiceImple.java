package com.cjc.main.MainServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.MainServiceI.productServiceI;
import com.cjc.main.exception.ProductNotFondException;
import com.cjc.main.model.Product;
import com.cjc.main.productRepository.ProductRepository;

@Service
public class productServiceImple implements productServiceI{

	@Autowired
	ProductRepository pr;

	@Override
	public void saveproduct(Product p) {
		
		pr.save(p);
	}

	@Override
	public List<Product> getproduct() {
		
		return (List<Product>) pr.findAll();
	}

	@Override
	public void deletepro(Product p) {
		
		pr.delete(p);
	}

	@Override
	public List<Product> searchproduct(String productname) {
		
		List<Product>list=pr.findByProductname(productname);
		if(list!=null)
		{
			return list;
		}
		
		
		else {
			throw new ProductNotFondException("Product Not Available");
		}
	}
	
	
	
	
	
	
	
}
