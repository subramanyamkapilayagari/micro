package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.RatingOnCust;
import com.slokam.picogo.cust.repo.RatingOnCustRepo;

import java.util.*;

public interface RatingOnCustService {
	
	public List<RatingOnCust> getAll();
	public RatingOnCust getById(Integer id);
	public RatingOnCust save(RatingOnCust RatingOnCust);
	public void remove(RatingOnCust RatingOnCust);
    public void remove(Integer id);
}
