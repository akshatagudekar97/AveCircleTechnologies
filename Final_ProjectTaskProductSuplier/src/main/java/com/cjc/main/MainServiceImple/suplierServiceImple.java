package com.cjc.main.MainServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.MainServiceI.suplierserviceI;
import com.cjc.main.model.Suplier;
import com.cjc.main.productRepository.SuplierRepository;

@Service
public class suplierServiceImple implements suplierserviceI{

	@Autowired
	
	SuplierRepository sr;

	@Override
	public void savesuplier(Suplier s) {
		
		sr.save(s);
	}

	@Override
	public void deletesupdata(Suplier s) {
		sr.delete(s);
	}

	@Override
	public List<Suplier> getsuplier() {
		
		return (List<Suplier>) sr.findAll();
	}
	
}
