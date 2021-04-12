package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustFavrateItem;
import com.slokam.picogo.cust.repo.CustFavrateItemRepo;

import java.util.*;

public interface CustFavrateItemService {
	
	public List<CustFavrateItem> getAll();
	public CustFavrateItem getById(Integer id);
	public CustFavrateItem save(CustFavrateItem CustFavrateItem);
	public void remove(CustFavrateItem CustFavrateItem);
    public void remove(Integer id);
}
