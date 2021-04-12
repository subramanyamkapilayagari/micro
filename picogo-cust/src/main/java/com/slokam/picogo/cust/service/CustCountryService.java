package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustCountry;
import com.slokam.picogo.cust.repo.CustCountryRepo;

import java.util.*;

public interface CustCountryService {
	
	public List<CustCountry> getAll();
	public CustCountry getById(Integer id);
	public CustCountry save(CustCountry CustCountry);
	public void remove(CustCountry CustCountry);
    public void remove(Integer id);
}
