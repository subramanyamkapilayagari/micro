package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.Cust;
import com.slokam.picogo.cust.repo.CustRepo;

import java.util.*;

public interface CustService {
	
	public List<Cust> getAll();
	public Cust getById(Integer id);
	public Cust save(Cust Cust);
	public void remove(Cust Cust);
    public void remove(Integer id);
}
