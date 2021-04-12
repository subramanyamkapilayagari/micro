package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustAddressType;
import com.slokam.picogo.cust.repo.CustAddressTypeRepo;

import java.util.*;

public interface CustAddressTypeService {
	
	public List<CustAddressType> getAll();
	public CustAddressType getById(Integer id);
	public CustAddressType save(CustAddressType CustAddressType);
	public void remove(CustAddressType CustAddressType);
    public void remove(Integer id);
}
