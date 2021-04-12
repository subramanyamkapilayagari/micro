package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.CustFavrateRstBrand;
import com.slokam.picogo.cust.repo.CustFavrateRstBrandRepo;
import com.slokam.picogo.cust.service.CustFavrateRstBrandService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustFavrateRstBrandServiceImpl implements CustFavrateRstBrandService {

      
   

	@Autowired
	private CustFavrateRstBrandRepo repo;
	
	@Override
	public List<CustFavrateRstBrand> getAll() {
		return repo.findAll();
	}

	@Override
	public CustFavrateRstBrand getById(Integer id) {
		
		Optional<CustFavrateRstBrand> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustFavrateRstBrand save(CustFavrateRstBrand todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustFavrateRstBrand todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
