package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustCity;
import com.slokam.picogo.cust.repo.CustCityRepo;
import com.slokam.picogo.cust.service.CustCityService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustCityServiceImpl implements CustCityService {

      
   

	@Autowired
	private CustCityRepo repo;
	
	@Override
	public List<CustCity> getAll() {
		return repo.findAll();
	}

	@Override
	public CustCity getById(Integer id) {
		
		Optional<CustCity> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustCity save(CustCity todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustCity todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
