package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.CustAddress;
import com.slokam.picogo.cust.service.CustAddressService;

@RestController
@RequestMapping("CustAddress") 
public class CustAddressController {
	 @Autowired
	 private CustAddressService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustAddress>	 saveCustAddress(@RequestBody CustAddress obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustAddress>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustAddress>	 deleteCustAddress(@RequestBody CustAddress obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustAddress>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustAddress>> getAllCustAddress(){
		 List<CustAddress> list = service.getAll();
		 return new ResponseEntity<List<CustAddress>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustAddress> getByIdCustAddress(@PathVariable Integer id) {
		  CustAddress obj =  service.getById(id);
		  return new ResponseEntity<CustAddress>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustAddress>	 
	 deleteCustAddress(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustAddress>(HttpStatus.OK);
	 }
}

