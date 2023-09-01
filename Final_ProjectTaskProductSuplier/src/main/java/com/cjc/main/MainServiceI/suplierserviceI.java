package com.cjc.main.MainServiceI;

import java.util.List;

import com.cjc.main.model.Suplier;

public interface suplierserviceI {

	public void savesuplier(Suplier s);
	public void deletesupdata(Suplier s);
	public List<Suplier> getsuplier();
	
}
