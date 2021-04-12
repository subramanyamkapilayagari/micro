package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustAddress;
import com.slokam.picogo.cust.repo.CustAddressRepo;

import java.util.*;

public interface CustAddressService {
	
	public List<CustAddress> getAll();
	public CustAddress getById(Integer id);
	public CustAddress save(CustAddress CustAddress);
	public void remove(CustAddress CustAddress);
    public void remove(Integer id);
}
