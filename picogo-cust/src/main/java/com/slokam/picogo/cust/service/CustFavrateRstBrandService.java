package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustFavrateRstBrand;
import com.slokam.picogo.cust.repo.CustFavrateRstBrandRepo;

import java.util.*;

public interface CustFavrateRstBrandService {
	
	public List<CustFavrateRstBrand> getAll();
	public CustFavrateRstBrand getById(Integer id);
	public CustFavrateRstBrand save(CustFavrateRstBrand CustFavrateRstBrand);
	public void remove(CustFavrateRstBrand CustFavrateRstBrand);
    public void remove(Integer id);
}
