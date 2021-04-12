package com.slokam.picogo.cust.service.impl;

import com.slokam.picogo.cust.entity.RatingOnCust;
import com.slokam.picogo.cust.repo.RatingOnCustRepo;
import com.slokam.picogo.cust.service.RatingOnCustService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RatingOnCustServiceImpl implements RatingOnCustService {

      
   

	@Autowired
	private RatingOnCustRepo repo;
	
	@Override
	public List<RatingOnCust> getAll() {
		return repo.findAll();
	}

	@Override
	public RatingOnCust getById(Integer id) {
		
		Optional<RatingOnCust> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public RatingOnCust save(RatingOnCust todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(RatingOnCust todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
