package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustDevices;
import com.slokam.picogo.cust.repo.CustDevicesRepo;

import java.util.*;

public interface CustDevicesService {
	
	public List<CustDevices> getAll();
	public CustDevices getById(Integer id);
	public CustDevices save(CustDevices CustDevices);
	public void remove(CustDevices CustDevices);
    public void remove(Integer id);
}
