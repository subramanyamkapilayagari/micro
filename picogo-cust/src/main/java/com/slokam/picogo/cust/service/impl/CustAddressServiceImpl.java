package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustAddress;
import com.slokam.picogo.cust.repo.CustAddressRepo;
import com.slokam.picogo.cust.service.CustAddressService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustAddressServiceImpl implements CustAddressService {

      
   

	@Autowired
	private CustAddressRepo repo;
	
	@Override
	public List<CustAddress> getAll() {
		return repo.findAll();
	}

	@Override
	public CustAddress getById(Integer id) {
		
		Optional<CustAddress> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustAddress save(CustAddress todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustAddress todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
