package com.cjc.main.productRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Suplier;

@Repository
public interface SuplierRepository extends CrudRepository<Suplier, Integer>{

}
