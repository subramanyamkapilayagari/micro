package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustCountry;
import com.slokam.picogo.cust.repo.CustCountryRepo;
import com.slokam.picogo.cust.service.CustCountryService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustCountryServiceImpl implements CustCountryService {

      
   

	@Autowired
	private CustCountryRepo repo;
	
	@Override
	public List<CustCountry> getAll() {
		return repo.findAll();
	}

	@Override
	public CustCountry getById(Integer id) {
		
		Optional<CustCountry> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustCountry save(CustCountry todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustCountry todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
