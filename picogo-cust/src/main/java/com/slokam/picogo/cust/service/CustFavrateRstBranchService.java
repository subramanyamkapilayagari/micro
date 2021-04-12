package com.slokam.picogo.cust.service;

import com.slokam.picogo.cust.entity.CustFavrateRstBranch;
import com.slokam.picogo.cust.repo.CustFavrateRstBranchRepo;

import java.util.*;

public interface CustFavrateRstBranchService {
	
	public List<CustFavrateRstBranch> getAll();
	public CustFavrateRstBranch getById(Integer id);
	public CustFavrateRstBranch save(CustFavrateRstBranch CustFavrateRstBranch);
	public void remove(CustFavrateRstBranch CustFavrateRstBranch);
    public void remove(Integer id);
}
