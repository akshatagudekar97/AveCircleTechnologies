package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.MainServiceI.productServiceI;
import com.cjc.main.MainServiceI.suplierserviceI;
import com.cjc.main.model.Product;
import com.cjc.main.model.Suplier;
@CrossOrigin("*")
@RestController
public class Homecontroller {

	@Autowired
	productServiceI ps;
	
	@Autowired
	suplierserviceI ss;
	
	//product
	@PostMapping(value="/prodata")
	public ResponseEntity<Product> saveproduct(@RequestBody Product p)
	{
		ps.saveproduct(p);
		
		return new ResponseEntity<Product>(p,HttpStatus.CREATED);
	}
	
	//product
	@GetMapping(value="/getprodata")
	public ResponseEntity<List<Product>> getproduct()
	{
		List<Product> list=ps.getproduct();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	//productt
	@PutMapping(value="/updateprodata/{id}")
	public ResponseEntity<Product> updatedata(@PathVariable int id,@RequestBody Product p)
	{
		ps.saveproduct(p);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
	
	//product
	@DeleteMapping(value="/deleteprodata/{id}")
	public ResponseEntity<Product> deletedata(@PathVariable int id, @ModelAttribute Product p)
	{
		ps.deletepro(p); 
		return new ResponseEntity<Product>(p,HttpStatus.NO_CONTENT);
	}
	
	
	@GetMapping(value="/search/{id}")
	public ResponseEntity<List<Product>> getid(@PathVariable String productname)
	{
		List<Product> list=(List<Product>)ps.searchproduct(productname);
		
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	//suplier
		@PostMapping(value="/supdata")
		public String savesuplier(@RequestBody Suplier s)
		{
			ss.savesuplier(s);
			return "success";
		}
		
		@GetMapping(value="/getsup")
		public List<Suplier> getdata()
		{
			List<Suplier>list =ss.getsuplier();
			return list;
			
		}
		//suplier
		@DeleteMapping(value="/supdeletedata/{id}")
		public String deletesuplier(@PathVariable int id,@ModelAttribute Suplier s)
		{
			ss.deletesupdata(s);
			return "deleteSuplier";
		}
	
}
