package com.cjc.main.productRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	public List<Product> findByProductname(String productname);
}
