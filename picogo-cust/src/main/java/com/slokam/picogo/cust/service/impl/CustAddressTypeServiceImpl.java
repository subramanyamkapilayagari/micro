package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustAddressType;
import com.slokam.picogo.cust.repo.CustAddressTypeRepo;
import com.slokam.picogo.cust.service.CustAddressTypeService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustAddressTypeServiceImpl implements CustAddressTypeService {

      
   

	@Autowired
	private CustAddressTypeRepo repo;
	
	@Override
	public List<CustAddressType> getAll() {
		return repo.findAll();
	}

	@Override
	public CustAddressType getById(Integer id) {
		
		Optional<CustAddressType> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustAddressType save(CustAddressType todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustAddressType todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
