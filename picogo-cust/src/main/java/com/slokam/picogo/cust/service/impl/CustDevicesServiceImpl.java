package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustDevices;
import com.slokam.picogo.cust.repo.CustDevicesRepo;
import com.slokam.picogo.cust.service.CustDevicesService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustDevicesServiceImpl implements CustDevicesService {

      
   

	@Autowired
	private CustDevicesRepo repo;
	
	@Override
	public List<CustDevices> getAll() {
		return repo.findAll();
	}

	@Override
	public CustDevices getById(Integer id) {
		
		Optional<CustDevices> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustDevices save(CustDevices todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustDevices todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
