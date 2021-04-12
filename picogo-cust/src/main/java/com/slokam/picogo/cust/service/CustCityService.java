package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustCity;
import com.slokam.picogo.cust.repo.CustCityRepo;

import java.util.*;

public interface CustCityService {
	
	public List<CustCity> getAll();
	public CustCity getById(Integer id);
	public CustCity save(CustCity CustCity);
	public void remove(CustCity CustCity);
    public void remove(Integer id);
}
